package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object emscripten {
  
  /**
    * A factory function is generated when setting the `MODULARIZE` build option
    * to `1` in your Emscripten build. It return a Promise that resolves to an
    * initialized, ready-to-call `EmscriptenModule` instance.
    *
    * By default, the factory function will be named `Module`. It's recommended to
    * use the `EXPORT_ES6` option, in which the factory function will be the
    * default export. If used without `EXPORT_ES6`, the factory function will be a
    * global variable. You can rename the variable using the `EXPORT_NAME` build
    * option. It's left to you to declare any global variables as needed in your
    * application's types.
    * @param moduleOverrides Default properties for the initialized module.
    */
  type EmscriptenModuleFactory[T /* <: typings.emscripten.EmscriptenModule */] = js.Function1[/* moduleOverrides */ js.UndefOr[typings.std.Partial[T]], js.Promise[T]]
}
