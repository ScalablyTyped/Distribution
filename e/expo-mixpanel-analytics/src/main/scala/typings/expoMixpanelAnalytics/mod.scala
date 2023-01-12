package typings.expoMixpanelAnalytics

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("expo-mixpanel-analytics", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ExpoMixpanelAnalytics {
    def this(token: String) = this()
    
    /* CompleteClass */
    override def identify(userId: String): Unit = js.native
    
    /* CompleteClass */
    override def people_append(props: Props[Any]): Unit = js.native
    
    /* CompleteClass */
    override def people_delete_user(): Unit = js.native
    
    /* CompleteClass */
    override def people_increment(props: Props[Double]): Unit = js.native
    
    /* CompleteClass */
    override def people_set(props: Props[Any]): Unit = js.native
    
    /* CompleteClass */
    override def people_set_once(props: Props[Any]): Unit = js.native
    
    /* CompleteClass */
    override def people_union(props: Props[js.Array[String]]): Unit = js.native
    
    /* CompleteClass */
    override def people_unset(keys: js.Array[String]): Unit = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    var token: String = js.native
    
    /* CompleteClass */
    override def track(name: String, props: Props[Any]): Unit = js.native
  }
  
  trait ExpoMixpanelAnalytics extends StObject {
    
    def identify(userId: String): Unit
    
    def people_append(props: Props[Any]): Unit
    
    def people_delete_user(): Unit
    
    def people_increment(props: Props[Double]): Unit
    
    def people_set(props: Props[Any]): Unit
    
    def people_set_once(props: Props[Any]): Unit
    
    def people_union(props: Props[js.Array[String]]): Unit
    
    def people_unset(keys: js.Array[String]): Unit
    
    def reset(): Unit
    
    var token: String
    
    def track(name: String, props: Props[Any]): Unit
  }
  object ExpoMixpanelAnalytics {
    
    inline def apply(
      identify: String => Unit,
      people_append: Props[Any] => Unit,
      people_delete_user: () => Unit,
      people_increment: Props[Double] => Unit,
      people_set: Props[Any] => Unit,
      people_set_once: Props[Any] => Unit,
      people_union: Props[js.Array[String]] => Unit,
      people_unset: js.Array[String] => Unit,
      reset: () => Unit,
      token: String,
      track: (String, Props[Any]) => Unit
    ): ExpoMixpanelAnalytics = {
      val __obj = js.Dynamic.literal(identify = js.Any.fromFunction1(identify), people_append = js.Any.fromFunction1(people_append), people_delete_user = js.Any.fromFunction0(people_delete_user), people_increment = js.Any.fromFunction1(people_increment), people_set = js.Any.fromFunction1(people_set), people_set_once = js.Any.fromFunction1(people_set_once), people_union = js.Any.fromFunction1(people_union), people_unset = js.Any.fromFunction1(people_unset), reset = js.Any.fromFunction0(reset), token = token.asInstanceOf[js.Any], track = js.Any.fromFunction2(track))
      __obj.asInstanceOf[ExpoMixpanelAnalytics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExpoMixpanelAnalytics] (val x: Self) extends AnyVal {
      
      inline def setIdentify(value: String => Unit): Self = StObject.set(x, "identify", js.Any.fromFunction1(value))
      
      inline def setPeople_append(value: Props[Any] => Unit): Self = StObject.set(x, "people_append", js.Any.fromFunction1(value))
      
      inline def setPeople_delete_user(value: () => Unit): Self = StObject.set(x, "people_delete_user", js.Any.fromFunction0(value))
      
      inline def setPeople_increment(value: Props[Double] => Unit): Self = StObject.set(x, "people_increment", js.Any.fromFunction1(value))
      
      inline def setPeople_set(value: Props[Any] => Unit): Self = StObject.set(x, "people_set", js.Any.fromFunction1(value))
      
      inline def setPeople_set_once(value: Props[Any] => Unit): Self = StObject.set(x, "people_set_once", js.Any.fromFunction1(value))
      
      inline def setPeople_union(value: Props[js.Array[String]] => Unit): Self = StObject.set(x, "people_union", js.Any.fromFunction1(value))
      
      inline def setPeople_unset(value: js.Array[String] => Unit): Self = StObject.set(x, "people_unset", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTrack(value: (String, Props[Any]) => Unit): Self = StObject.set(x, "track", js.Any.fromFunction2(value))
    }
  }
  
  type Props[T] = StringDictionary[T]
}
