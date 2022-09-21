package typings.disposableEmail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("disposable-email", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validate(domainOrEmail: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(domainOrEmail.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def validate(domainOrEmail: String, callback: js.Function2[/* error */ Null, /* isValid */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validate")(domainOrEmail.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
