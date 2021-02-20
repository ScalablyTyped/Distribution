package typings.fmWebsync.fm.websync

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait subscribersChangeArgs extends baseResponseArgs {
  
  /**
    * The details of the change that occurred.
    */
  var change: js.UndefOr[subscribersChange] = js.native
  
  /**
    * The channel on which the change occurred.
    */
  var channel: js.UndefOr[String] = js.native
}
object subscribersChangeArgs {
  
  @scala.inline
  def apply(client: client, clientId: String, meta: js.Any, timestamp: Date): subscribersChangeArgs = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[subscribersChangeArgs]
  }
  
  @scala.inline
  implicit class subscribersChangeArgsMutableBuilder[Self <: subscribersChangeArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChange(value: subscribersChange): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
  }
}
