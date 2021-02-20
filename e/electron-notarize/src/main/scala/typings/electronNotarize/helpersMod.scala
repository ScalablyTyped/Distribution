package typings.electronNotarize

import typings.electronNotarize.electronNotarizeNumbers.`0`
import typings.electronNotarize.electronNotarizeNumbers.`2`
import typings.electronNotarize.electronNotarizeStrings.`in progress`
import typings.electronNotarize.electronNotarizeStrings.invalid
import typings.electronNotarize.electronNotarizeStrings.success
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("electron-notarize/lib/helpers", "isSecret")
  @js.native
  def isSecret(s: String): Boolean = js.native
  
  @JSImport("electron-notarize/lib/helpers", "makeSecret")
  @js.native
  def makeSecret(s: String): String = js.native
  
  @JSImport("electron-notarize/lib/helpers", "parseNotarizationInfo")
  @js.native
  def parseNotarizationInfo(info: String): NotarizationInfo = js.native
  
  @JSImport("electron-notarize/lib/helpers", "withTempDir")
  @js.native
  def withTempDir[T](fn: js.Function1[/* dir */ String, js.Promise[T]]): js.Promise[T] = js.native
  
  @js.native
  trait NotarizationInfo extends StObject {
    
    var date: Date = js.native
    
    var logFileUrl: String | Null = js.native
    
    var status: invalid | (`in progress`) | success = js.native
    
    var statusCode: js.UndefOr[`0` | `2`] = js.native
    
    var statusMessage: js.UndefOr[String] = js.native
    
    var uuid: String = js.native
  }
  object NotarizationInfo {
    
    @scala.inline
    def apply(date: Date, status: invalid | (`in progress`) | success, uuid: String): NotarizationInfo = {
      val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotarizationInfo]
    }
    
    @scala.inline
    implicit class NotarizationInfoMutableBuilder[Self <: NotarizationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogFileUrl(value: String): Self = StObject.set(x, "logFileUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogFileUrlNull: Self = StObject.set(x, "logFileUrl", null)
      
      @scala.inline
      def setStatus(value: invalid | (`in progress`) | success): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCode(value: `0` | `2`): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
      
      @scala.inline
      def setStatusMessage(value: String): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      @scala.inline
      def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
}
