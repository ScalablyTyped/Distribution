package typings.firebaseAppCheck

import typings.firebaseApp.mod.FirebaseApp
import typings.firebaseAppCheck.srcRecaptchaMod.GreCAPTCHA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilMod {
  
  @JSImport("@firebase/app-check/dist/src/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def ensureActivated(app: FirebaseApp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureActivated")(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getDurationString(durationInMillis: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDurationString")(durationInMillis.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getRecaptcha(): js.UndefOr[GreCAPTCHA] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecaptcha")().asInstanceOf[js.UndefOr[GreCAPTCHA]]
  inline def getRecaptcha(isEnterprise: Boolean): js.UndefOr[GreCAPTCHA] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRecaptcha")(isEnterprise.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[GreCAPTCHA]]
}
