package typings
package espruinoLib

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
org.scalablytyped.runtime.Instantiable4[
      /* timerName */ js.Any, 
      /* group */ scala.Double, 
      /* index */ scala.Double, 
      /* isrIndex */ scala.Double, 
      js.Any
    ] {
  /**
    * <p>logs list of timers</p>
    * 
    * @url http://www.espruino.com/Reference#l_Timer_log
    */
  def log(): scala.Unit = js.native
  /**
    * <p>Reschedules a timer, needs to be started at least once</p>
    * 
    * @param duration 
    * @url http://www.espruino.com/Reference#l_Timer_reschedule
    */
  def reschedule(duration: scala.Double): scala.Unit = js.native
  /**
    * <p>Starts a timer</p>
    * 
    * @param duration 
    * @url http://www.espruino.com/Reference#l_Timer_start
    */
  def start(duration: scala.Double): scala.Unit = js.native
}

