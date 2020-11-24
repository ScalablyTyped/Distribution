package typings.followRedirects

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Override[T, U] = (typings.std.Pick[
    T, 
    typings.std.Exclude[/* keyof T */ java.lang.String, /* keyof U */ java.lang.String]
  ]) with U
  
  type WrappedScheme[T /* <: typings.followRedirects.mod.Scheme[_, _, _] */] = typings.followRedirects.mod.Override[T, typings.followRedirects.mod.RedirectScheme[js.Any, js.Any, js.Any]]
}
