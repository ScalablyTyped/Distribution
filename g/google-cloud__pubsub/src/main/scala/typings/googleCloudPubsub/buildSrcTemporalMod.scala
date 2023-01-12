package typings.googleCloudPubsub

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTemporalMod {
  
  @JSImport("@google-cloud/pubsub/build/src/temporal", "Duration")
  @js.native
  /* private */ open class Duration () extends StObject {
    
    /* private */ var millis: Any = js.native
    
    /**
      * Calculates the total number of units of type 'totalOf' that would
      * fit inside this duration.
      */
    def totalOf(totalOf: TotalOfUnit): Double = js.native
  }
  /* static members */
  object Duration {
    
    @JSImport("@google-cloud/pubsub/build/src/temporal", "Duration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a Duration from a DurationLike, which is an object
      * containing zero or more of the following: hours, seconds,
      * minutes, millis.
      */
    inline def from(durationLike: DurationLike): Duration = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(durationLike.asInstanceOf[js.Any]).asInstanceOf[Duration]
    
    @JSImport("@google-cloud/pubsub/build/src/temporal", "Duration.hourInMillis")
    @js.native
    def hourInMillis: Any = js.native
    inline def hourInMillis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hourInMillis")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/temporal", "Duration.minuteInMillis")
    @js.native
    def minuteInMillis: Any = js.native
    inline def minuteInMillis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("minuteInMillis")(x.asInstanceOf[js.Any])
    
    @JSImport("@google-cloud/pubsub/build/src/temporal", "Duration.secondInMillis")
    @js.native
    def secondInMillis: Any = js.native
    inline def secondInMillis_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secondInMillis")(x.asInstanceOf[js.Any])
  }
  
  trait DurationLike extends StObject {
    
    var hours: js.UndefOr[Double] = js.undefined
    
    var millis: js.UndefOr[Double] = js.undefined
    
    var minutes: js.UndefOr[Double] = js.undefined
    
    var seconds: js.UndefOr[Double] = js.undefined
  }
  object DurationLike {
    
    inline def apply(): DurationLike = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DurationLike]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DurationLike] (val x: Self) extends AnyVal {
      
      inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
      
      inline def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
      
      inline def setMillis(value: Double): Self = StObject.set(x, "millis", value.asInstanceOf[js.Any])
      
      inline def setMillisUndefined: Self = StObject.set(x, "millis", js.undefined)
      
      inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
      
      inline def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
      
      inline def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
      
      inline def setSecondsUndefined: Self = StObject.set(x, "seconds", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.googleCloudPubsub.googleCloudPubsubStrings.hour
    - typings.googleCloudPubsub.googleCloudPubsubStrings.minute
    - typings.googleCloudPubsub.googleCloudPubsubStrings.second
    - typings.googleCloudPubsub.googleCloudPubsubStrings.millisecond
  */
  trait TotalOfUnit extends StObject
  object TotalOfUnit {
    
    inline def hour: typings.googleCloudPubsub.googleCloudPubsubStrings.hour = "hour".asInstanceOf[typings.googleCloudPubsub.googleCloudPubsubStrings.hour]
    
    inline def millisecond: typings.googleCloudPubsub.googleCloudPubsubStrings.millisecond = "millisecond".asInstanceOf[typings.googleCloudPubsub.googleCloudPubsubStrings.millisecond]
    
    inline def minute: typings.googleCloudPubsub.googleCloudPubsubStrings.minute = "minute".asInstanceOf[typings.googleCloudPubsub.googleCloudPubsubStrings.minute]
    
    inline def second: typings.googleCloudPubsub.googleCloudPubsubStrings.second = "second".asInstanceOf[typings.googleCloudPubsub.googleCloudPubsubStrings.second]
  }
}
