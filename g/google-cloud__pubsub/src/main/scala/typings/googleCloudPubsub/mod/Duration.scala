package typings.googleCloudPubsub.mod

import typings.googleCloudPubsub.temporalMod.DurationLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@google-cloud/pubsub", "Duration")
@js.native
/* private */ open class Duration ()
  extends typings.googleCloudPubsub.temporalMod.Duration
/* static members */
object Duration {
  
  @JSImport("@google-cloud/pubsub", "Duration")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a Duration from a DurationLike, which is an object
    * containing zero or more of the following: hours, seconds,
    * minutes, millis.
    */
  inline def from(durationLike: DurationLike): typings.googleCloudPubsub.temporalMod.Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(durationLike.asInstanceOf[js.Any]).asInstanceOf[typings.googleCloudPubsub.temporalMod.Duration]
  
  @JSImport("@google-cloud/pubsub", "Duration.hourInMillis")
  @js.native
  def hourInMillis: Any = js.native
  inline def hourInMillis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourInMillis")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/pubsub", "Duration.minuteInMillis")
  @js.native
  def minuteInMillis: Any = js.native
  inline def minuteInMillis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteInMillis")(x.asInstanceOf[js.Any])
  
  @JSImport("@google-cloud/pubsub", "Duration.secondInMillis")
  @js.native
  def secondInMillis: Any = js.native
  inline def secondInMillis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondInMillis")(x.asInstanceOf[js.Any])
}
