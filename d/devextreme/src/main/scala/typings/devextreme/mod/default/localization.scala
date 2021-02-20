package typings.devextreme.mod.default

import typings.devextreme.mod.DevExpress.ui.format
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("devextreme", "default.localization")
@js.native
class localization ()
  extends typings.devextreme.mod.DevExpress.localization
/* static members */
object localization {
  
  /**
    * [descr:localization.formatDate(value, format)]
    */
  @JSImport("devextreme", "default.localization.formatDate")
  @js.native
  def formatDate(value: Date, format: format): String = js.native
  
  /**
    * [descr:localization.formatMessage(key, value)]
    */
  @JSImport("devextreme", "default.localization.formatMessage")
  @js.native
  def formatMessage(key: String, value: String): String = js.native
  @JSImport("devextreme", "default.localization.formatMessage")
  @js.native
  def formatMessage(key: String, value: js.Array[String]): String = js.native
  
  /**
    * [descr:localization.formatNumber(value, format)]
    */
  @JSImport("devextreme", "default.localization.formatNumber")
  @js.native
  def formatNumber(value: Double, format: format): String = js.native
  
  /**
    * [descr:localization.loadMessages(messages)]
    */
  @JSImport("devextreme", "default.localization.loadMessages")
  @js.native
  def loadMessages(messages: js.Any): Unit = js.native
  
  /**
    * [descr:localization.locale()]
    */
  @JSImport("devextreme", "default.localization.locale")
  @js.native
  def locale(): String = js.native
  /**
    * [descr:localization.locale(locale)]
    */
  @JSImport("devextreme", "default.localization.locale")
  @js.native
  def locale(locale: String): Unit = js.native
  
  /**
    * [descr:localization.parseDate(text, format)]
    */
  @JSImport("devextreme", "default.localization.parseDate")
  @js.native
  def parseDate(text: String, format: format): Date = js.native
  
  /**
    * [descr:localization.parseNumber(text, format)]
    */
  @JSImport("devextreme", "default.localization.parseNumber")
  @js.native
  def parseNumber(text: String, format: format): Double = js.native
}
