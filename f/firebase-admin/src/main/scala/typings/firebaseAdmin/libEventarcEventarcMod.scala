package typings.firebaseAdmin

import typings.firebaseAdmin.libAppCoreMod.App
import typings.firebaseAdmin.libEventarcCloudeventMod.CloudEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEventarcEventarcMod {
  
  @JSImport("firebase-admin/lib/eventarc/eventarc", "Channel")
  @js.native
  open class Channel () extends StObject {
    
    /**
      * List of event types allowed by this channel for publishing. Other event types are ignored.
      */
    val allowedEventTypes: js.UndefOr[js.Array[String]] = js.native
    
    /* private */ val client: Any = js.native
    
    /**
      * The {@link firebase-admin.eventarc#Eventarc} service instance associated with the current `Channel`.
      *
      * @example
      * ```javascript
      * var app = channel.eventarc;
      * ```
      */
    def eventarc: Eventarc = js.native
    
    /* private */ val eventarcInternal: Any = js.native
    
    /**
      * The channel name as provided during channel creation. If it was not specifed, the default channel name is returned
      * ('locations/us-central1/channels/firebase').
      */
    def name: String = js.native
    
    /* private */ var nameInternal: Any = js.native
    
    def publish(events: js.Array[CloudEvent]): js.Promise[Unit] = js.native
    /**
      * Publishes provided events to this channel. If channel was created with `allowedEventTypes` and event type is not
      * on that list, the event is ignored.
      *
      * @param events - CloudEvent to publish to the channel.
      */
    def publish(events: CloudEvent): js.Promise[Unit] = js.native
  }
  
  @JSImport("firebase-admin/lib/eventarc/eventarc", "Eventarc")
  @js.native
  open class Eventarc () extends StObject {
    
    /**
      * The {@link firebase-admin.app#App} associated with the current Eventarc service
      * instance.
      *
      * @example
      * ```javascript
      * var app = eventarc.app;
      * ```
      */
    def app: App = js.native
    
    /* private */ val appInternal: Any = js.native
    
    /**
      * Create a reference to the default Firebase channel:
      * `locations/us-central1/channels/firebase`
      *
      * @param options - (optional) additional channel options
      * @returns Eventarc channel reference for publishing events.
      */
    def channel(): Channel = js.native
    /**
      * Creates a reference to the Eventarc channel using the provided channel resource name.
      * The channel resource name can be either:
      *
      * - A fully qualified channel resource name:
      *     `projects/{project}/locations/{location}/channels/{channel-id}`
      *
      * - A partial resource name with location and channel ID, in which case
      *     the runtime project ID of the function is used:
      *     `locations/{location}/channels/{channel-id}`
      *
      * - A partial channel ID, in which case the runtime project ID of the
      *     function and `us-central1` as location is used:
      *     `{channel-id}`
      *
      * @param name - Channel resource name.
      * @param options - (optional) additional channel options
      * @returns An Eventarc channel reference for publishing events.
      */
    def channel(name: String): Channel = js.native
    def channel(name: String, options: ChannelOptions): Channel = js.native
    def channel(options: ChannelOptions): Channel = js.native
  }
  
  trait ChannelOptions extends StObject {
    
    /**
      * An array of allowed event types. If specified, publishing events of
      * unknown types is a no op. When not provided, no event filtering is
      * performed.
      */
    var allowedEventTypes: js.UndefOr[js.Array[String] | String] = js.undefined
  }
  object ChannelOptions {
    
    inline def apply(): ChannelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChannelOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChannelOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowedEventTypes(value: js.Array[String] | String): Self = StObject.set(x, "allowedEventTypes", value.asInstanceOf[js.Any])
      
      inline def setAllowedEventTypesUndefined: Self = StObject.set(x, "allowedEventTypes", js.undefined)
      
      inline def setAllowedEventTypesVarargs(value: String*): Self = StObject.set(x, "allowedEventTypes", js.Array(value*))
    }
  }
}
