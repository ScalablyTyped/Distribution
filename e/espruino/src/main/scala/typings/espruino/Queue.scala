package typings.espruino

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* <p>Creates a Queue Object</p>
* 
* @url http://www.espruino.com/Reference#l_Queue_Queue
*/
@js.native
trait Queue
  extends /**
  * 
  * @param queueName 
  * @return  
  */
Instantiable1[/* queueName */ js.Any, js.Any] {
  /**
    * <p>logs list of queues</p>
    * 
    * @url http://www.espruino.com/Reference#l_Queue_log
    */
  def log(): Unit = js.native
  /**
    * <p>reads one character from queue, if available</p>
    * 
    * @url http://www.espruino.com/Reference#l_Queue_read
    */
  def read(): Unit = js.native
  /**
    * <p>Writes one character to queue</p>
    * 
    * @param char 
    * @url http://www.espruino.com/Reference#l_Queue_writeChar
    */
  def writeChar(char: js.Any): Unit = js.native
}

