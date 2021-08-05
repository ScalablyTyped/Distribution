package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "OAuth2Http")
@js.native
class OAuth2Http protected () extends StObject {
  def this(options: js.Any, storage: js.Any) = this()
  
  def base(): Unit = js.native
  
  def refresh(callback: js.Any): js.Any = js.native
  
  def request(options: js.Any): js.Any = js.native
}
object OAuth2Http {
  
  @JSImport("gitana", "OAuth2Http")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("gitana", "OAuth2Http.AUTHORIZATION_CODE")
  @js.native
  def AUTHORIZATION_CODE: String = js.native
  inline def AUTHORIZATION_CODE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AUTHORIZATION_CODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("gitana", "OAuth2Http.COOKIE")
  @js.native
  def COOKIE: String = js.native
  inline def COOKIE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("COOKIE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("gitana", "OAuth2Http.PASSWORD")
  @js.native
  def PASSWORD: String = js.native
  inline def PASSWORD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PASSWORD")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def Storage(scope: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Storage")(scope.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  @JSImport("gitana", "OAuth2Http.TICKET")
  @js.native
  def TICKET: String = js.native
  inline def TICKET_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TICKET")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("gitana", "OAuth2Http.TOKEN")
  @js.native
  def TOKEN: String = js.native
  inline def TOKEN_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOKEN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("gitana", "OAuth2Http.TOKEN_METHOD")
  @js.native
  def TOKEN_METHOD: String = js.native
  inline def TOKEN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOKEN_METHOD")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def extend(_instance: js.Any, _static: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def forEach(`object`: js.Any, block: js.Any, context: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /* static member */
  inline def toString_(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[js.Any]
  
  /* static member */
  inline def valueOf_(`type`: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
