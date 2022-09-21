package typings.discordRichPresence

import org.scalablytyped.runtime.StringDictionary
import typings.discordRichPresence.anon.PartialPresenceInfo
import typings.discordRichPresence.discordRichPresenceStrings.IGNORE
import typings.discordRichPresence.discordRichPresenceStrings.NO
import typings.discordRichPresence.discordRichPresenceStrings.YES
import typings.discordRichPresence.discordRichPresenceStrings.connected
import typings.discordRichPresence.discordRichPresenceStrings.error
import typings.discordRichPresence.discordRichPresenceStrings.join
import typings.discordRichPresence.discordRichPresenceStrings.joinRequest
import typings.discordRichPresence.discordRichPresenceStrings.spectate
import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Connects to your application
    * @param clientID Get the client ID from the `General Information` page of your [Discord application](https://discord.com/developers/applications)
    */
  inline def apply(clientID: String): RP = ^.asInstanceOf[js.Dynamic].apply(clientID.asInstanceOf[js.Any]).asInstanceOf[RP]
  
  @JSImport("discord-rich-presence", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("discord-rich-presence", "RP")
  @js.native
  open class RP () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def disconnect(): Unit = js.native
    
    def on(event: join | spectate, listener: js.Function1[/* secret */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_connected(event: connected, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ String, Unit]): this.type = js.native
    @JSName("on")
    def on_joinRequest(event: joinRequest, listener: js.Function1[/* user */ String, Unit]): this.type = js.native
    
    def reply(user: String, response: YES | NO | IGNORE): Unit = js.native
    
    /**
      * Updates the presence
      * @param presence Presence settings object. All properties are optional.
      */
    def updatePresence(presence: PartialPresenceInfo): Unit = js.native
  }
  
  /**
    * Go to the `Rich Presence > Visualizer` settings of your [Discord application](https://discord.com/developers/applications) to find out how this would be rendered.
    */
  trait PresenceInfo
    extends StObject
       with /* key */ StringDictionary[String | Double | js.Date | Boolean] {
    
    /** What the player is currently doing */
    var details: String
    
    /** Epoch seconds until game's end - setting this will show the time as "remaining" */
    var endTimestamp: Double | js.Date
    
    var instance: Boolean
    
    /** Key of the uploaded image / asset for the large profile artwork */
    var largeImageKey: String
    
    /** Key of the uploaded image / asset for the small profile artwork */
    var smallImageKey: String
    
    /** Epoch seconds for game start - setting this will show the time as "elapsed" */
    var startTimestamp: Double | js.Date
    
    /** The user's current party status */
    var state: String
  }
  object PresenceInfo {
    
    inline def apply(
      details: String,
      endTimestamp: Double | js.Date,
      instance: Boolean,
      largeImageKey: String,
      smallImageKey: String,
      startTimestamp: Double | js.Date,
      state: String
    ): PresenceInfo = {
      val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], endTimestamp = endTimestamp.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], largeImageKey = largeImageKey.asInstanceOf[js.Any], smallImageKey = smallImageKey.asInstanceOf[js.Any], startTimestamp = startTimestamp.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[PresenceInfo]
    }
    
    extension [Self <: PresenceInfo](x: Self) {
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setEndTimestamp(value: Double | js.Date): Self = StObject.set(x, "endTimestamp", value.asInstanceOf[js.Any])
      
      inline def setInstance(value: Boolean): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setLargeImageKey(value: String): Self = StObject.set(x, "largeImageKey", value.asInstanceOf[js.Any])
      
      inline def setSmallImageKey(value: String): Self = StObject.set(x, "smallImageKey", value.asInstanceOf[js.Any])
      
      inline def setStartTimestamp(value: Double | js.Date): Self = StObject.set(x, "startTimestamp", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
