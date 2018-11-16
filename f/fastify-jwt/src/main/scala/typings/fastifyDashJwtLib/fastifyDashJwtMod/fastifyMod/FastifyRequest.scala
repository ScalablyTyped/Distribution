package typings
package fastifyDashJwtLib.fastifyDashJwtMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastifyRequest[HttpRequest] extends js.Object {
  def jwtVerify(): (stdLib.Promise[scala.Null | ScalablyTyped.runtime.StringDictionary[_] | java.lang.String]) | scala.Null | ScalablyTyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def jwtVerify(options: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback): (stdLib.Promise[scala.Null | ScalablyTyped.runtime.StringDictionary[_] | java.lang.String]) | scala.Null | ScalablyTyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def jwtVerify(
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback,
    next: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): (stdLib.Promise[scala.Null | ScalablyTyped.runtime.StringDictionary[_] | java.lang.String]) | scala.Null | ScalablyTyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def jwtVerify(options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions): (stdLib.Promise[scala.Null | ScalablyTyped.runtime.StringDictionary[_] | java.lang.String]) | scala.Null | ScalablyTyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def jwtVerify(
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions,
    next: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): (stdLib.Promise[scala.Null | ScalablyTyped.runtime.StringDictionary[_] | java.lang.String]) | scala.Null | ScalablyTyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
}

