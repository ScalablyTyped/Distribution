package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.ui.format
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.localization")
@js.native
class localization ()
  extends StObject
     with typings.devextreme.mod.DevExpress.localization
/* static members */
object localization {
  
  @JSImport("devextreme", "default.localization")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * [descr:localization.formatDate(value, format)]
    */
  @scala.inline
  def formatDate(value: Date, format: format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDate")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * [descr:localization.formatMessage(key, value)]
    */
  @scala.inline
  def formatMessage(key: String, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def formatMessage(key: String, value: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatMessage")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * [descr:localization.formatNumber(value, format)]
    */
  @scala.inline
  def formatNumber(value: Double, format: format): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatNumber")(value.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * [descr:localization.loadMessages(messages)]
    */
  @scala.inline
  def loadMessages(messages: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadMessages")(messages.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * [descr:localization.locale()]
    */
  @scala.inline
  def locale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")().asInstanceOf[String]
  /**
    * [descr:localization.locale(locale)]
    */
  @scala.inline
  def locale(locale: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("locale")(locale.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * [descr:localization.parseDate(text, format)]
    */
  @scala.inline
  def parseDate(text: String, format: format): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Date]
  
  /**
    * [descr:localization.parseNumber(text, format)]
    */
  @scala.inline
  def parseNumber(text: String, format: format): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseNumber")(text.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[Double]
}
