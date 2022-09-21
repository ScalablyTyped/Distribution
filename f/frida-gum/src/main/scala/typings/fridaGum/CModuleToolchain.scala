package typings.fridaGum

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Toolchain to use when constructing a CModule from C source code.
  *
  * `internal`: Use TinyCC, which is statically linked into the runtime.
  *     Never touches the filesystem and works even in sandboxed processes.
  *     The generated code is however not optimized, as TinyCC optimizes for
  *     small compiler footprint and short compilation times.
  * `external`: Use toolchain provided by the target system, assuming it is
  *     accessible to the process we're executing inside.
  * `any`: Same as `internal` if `Process.arch` is supported by TinyCC, and
  *     `external` otherwise.
  */
/* Rewritten from type alias, can be one of: 
  - typings.fridaGum.fridaGumStrings.any
  - typings.fridaGum.fridaGumStrings.internal
  - typings.fridaGum.fridaGumStrings.external
*/
trait CModuleToolchain extends StObject
object CModuleToolchain {
  
  inline def any: typings.fridaGum.fridaGumStrings.any = "any".asInstanceOf[typings.fridaGum.fridaGumStrings.any]
  
  inline def external: typings.fridaGum.fridaGumStrings.external = "external".asInstanceOf[typings.fridaGum.fridaGumStrings.external]
  
  inline def internal: typings.fridaGum.fridaGumStrings.internal = "internal".asInstanceOf[typings.fridaGum.fridaGumStrings.internal]
}
