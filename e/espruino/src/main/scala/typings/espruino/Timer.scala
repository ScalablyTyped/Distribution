package typings.espruino

import org.scalablytyped.runtime.Instantiable4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Creates a Timer Object</p>
* 
* @url http://www.espruino.com/Reference#l_Timer_Timer
*/
@js.native
trait Timer
  extends /**
  * 
  * @param timerName 
  * @param group 
  * @param index 
  * @param isrIndex 
  * @return  
  */
Instantiable4[
      /* timerName */ js.Any, 
      /* group */ Double, 
      /* index */ Double, 
      /* isrIndex */ Double, 
      js.Any
    ] {
  /**
    * <p>logs list of timers</p>
    * 
    * @url http://www.espruino.com/Reference#l_Timer_log
    */
  def log(): Unit = js.native
  /**
    * <p>Reschedules a timer, needs to be started at least once</p>
    * 
    * @param duration 
    * @url http://www.espruino.com/Reference#l_Timer_reschedule
    */
  def reschedule(duration: Double): Unit = js.native
  /**
    * <p>Starts a timer</p>
    * 
    * @param duration 
    * @url http://www.espruino.com/Reference#l_Timer_start
    */
  def start(duration: Double): Unit = js.native
}

