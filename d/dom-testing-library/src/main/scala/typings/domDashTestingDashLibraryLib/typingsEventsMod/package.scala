package typings
package domDashTestingDashLibraryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typingsEventsMod {
  type FireFunction = js.Function2[
    /* element */ stdLib.Element | stdLib.Window, 
    /* event */ stdLib.Event, 
    scala.Boolean
  ]
  type FireObject = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in dom-testing-library.dom-testing-library/typings/events.EventType ]: (element : std.Element | std.Window, options? : {}): boolean}
    */ domDashTestingDashLibraryLib.domDashTestingDashLibraryLibStrings.FireObject with js.Any
}
