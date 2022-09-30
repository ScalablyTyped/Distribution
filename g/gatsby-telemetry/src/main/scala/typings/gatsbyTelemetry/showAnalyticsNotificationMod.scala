package typings.gatsbyTelemetry

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object showAnalyticsNotificationMod {
  
  @JSImport("gatsby-telemetry/lib/show-analytics-notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def showAnalyticsNotification(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAnalyticsNotification")().asInstanceOf[Unit]
  inline def showAnalyticsNotification(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify boxen.Options */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showAnalyticsNotification")(config.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def showAnalyticsNotification(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify boxen.Options */ Any,
    message: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showAnalyticsNotification")(config.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def showAnalyticsNotification(config: Unit, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("showAnalyticsNotification")(config.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
