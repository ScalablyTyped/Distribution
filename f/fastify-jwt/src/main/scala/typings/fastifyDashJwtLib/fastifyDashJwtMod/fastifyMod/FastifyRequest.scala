package typings
package fastifyDashJwtLib.fastifyDashJwtMod.fastifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FastifyRequest[HttpRequest] extends js.Object {
  def jwtVerify(): (js.Promise[scala.Null | org.scalablytyped.runtime.StringDictionary[_] | java.lang.String]) | scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def jwtVerify(options: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback): (js.Promise[scala.Null | org.scalablytyped.runtime.StringDictionary[_] | java.lang.String]) | scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def jwtVerify(
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback,
    next: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): (js.Promise[scala.Null | org.scalablytyped.runtime.StringDictionary[_] | java.lang.String]) | scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def jwtVerify(options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions): (js.Promise[scala.Null | org.scalablytyped.runtime.StringDictionary[_] | java.lang.String]) | scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
  def jwtVerify(
    options: jsonwebtokenLib.jsonwebtokenMod.VerifyOptions,
    next: jsonwebtokenLib.jsonwebtokenMod.VerifyCallback
  ): (js.Promise[scala.Null | org.scalablytyped.runtime.StringDictionary[_] | java.lang.String]) | scala.Null | org.scalablytyped.runtime.StringDictionary[js.Any] | java.lang.String = js.native
}

