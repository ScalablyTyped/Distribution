package typings.gitana.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("gitana", "OAuth2Http")
@js.native
open class OAuth2Http protected () extends StObject {
  def this(options: Any, storage: Any) = this()
  
  def base(): Unit = js.native
  
  def refresh(callback: Any): Any = js.native
  
  def request(options: Any): Any = js.native
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
  inline def Storage(scope: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Storage")(scope.asInstanceOf[js.Any]).asInstanceOf[Any]
  
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
  inline def extend(_instance: Any, _static: Any, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((List(_instance.asInstanceOf[js.Any], _static.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  /* static member */
  inline def forEach(`object`: Any, block: Any, context: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(`object`.asInstanceOf[js.Any], block.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def implement(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("implement")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  /* static member */
  inline def toString_(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[Any]
  
  /* static member */
  inline def valueOf_(`type`: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("valueOf")(`type`.asInstanceOf[js.Any]).asInstanceOf[Any]
}
