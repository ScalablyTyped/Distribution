package typings.espruino.PuckNs

import typings.espruino.Pin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Puck")
@js.native
object ^ extends js.Object {
  /**
    * <p>Capacitive sense - the higher the capacitance, the higher the number returned.</p>
    * <p>If called without arguments, a value depending on the capacitance of what is 
    * attached to pin D11 will be returned. If you attach a length of wire to D11,
    * you&#39;ll be able to see a higher value returned when your hand is near the wire
    * than when it is away.</p>
    * <p>You can also supply pins to use yourself, however if you do this then
    * the TX pin must be connected to RX pin and sense plate via a roughly 1MOhm 
    * resistor.</p>
    * <p>When not supplying pins, Puck.js uses an internal resistor between D12(tx)
    * and D11(rx).</p>
    * 
    * @param tx 
    * @param rx 
    * @return  
    * @url http://www.espruino.com/Reference#l_Puck_capSense
    */
  def capSense(tx: Pin, rx: Pin): Double = js.native
  /**
    * <p>Return an approximate battery percentage remaining based on
    * a normal CR2032 battery (2.8 - 2.2v)</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Puck_getBatteryPercentage
    */
  def getBatteryPercentage(): Double = js.native
  /**
    * <p>Return a light value based on the light the red LED is seeing.</p>
    * <p><strong>Note:</strong> If called more than 5 times per second, the received light value
    * may not be accurate.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Puck_light
    */
  def light(): Double = js.native
  /**
    * <p>Turn on the magnetometer, take a single reading, and then turn it off again.</p>
    * <p>An object of the form <code>{x,y,z}</code> is returned containing magnetometer readings.
    * Due to residual magnetism in the Puck and magnetometer itself, with
    * no magnetic field the Puck will not return <code>{x:0,y:0,z:0}</code>.</p>
    * <p>Instead, it&#39;s up to you to figure out what the &#39;zero value&#39; is for your
    * Puck in your location and to then subtract that from the value returned. If
    * you&#39;re not trying to measure the Earth&#39;s magnetic field then it&#39;s a good idea
    * to just take a reading at startup and use that.</p>
    * <p>With the aerial at the top of the board, the <code>y</code> reading is vertical, <code>x</code> is
    * horizontal, and <code>z</code> is through the board.</p>
    * <p>Readings are in increments of 0.1 micro Tesla (uT). The Earth&#39;s magnetic field
    * varies from around 25-60 uT, so the reading will vary by 250 to 600 depending
    * on location.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Puck_mag
    */
  def mag(): js.Any = js.native
  /**
    * <p>Turn the magnetometer off</p>
    * 
    * @url http://www.espruino.com/Reference#l_Puck_magOff
    */
  def magOff(): Unit = js.native
  /**
    * <p>Turn on the magnetometer, take a single temperature reading from the MAG3110 chip, and then turn it off again.</p>
    * <p>(If the magnetometer is already on, this just returns the last reading obtained)</p>
    * <p><code>E.getTemperature()</code> uses the microcontroller&#39;s temperature sensor, but this uses the magnetometer&#39;s.</p>
    * <p>The reading obtained is an integer (so no decimal places), but the sensitivity is factory trimmed. to 1&deg;C, however the temperature
    * offset isn&#39;t - so absolute readings may still need calibrating.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Puck_magTemp
    */
  def magTemp(): Double = js.native
  /**
    * <p>Run a self-test, and return true for a pass. This checks for shorts
    * between pins, so your Puck shouldn&#39;t have anything connected to it.</p>
    * <p><strong>Note:</strong> This self-test auto starts if you hold the button on your Puck
    * down while inserting the battery, leave it pressed for 3 seconds (while
    * the green LED is lit) and release it soon after all LEDs turn on. 5
    * red blinks is a fail, 5 green is a pass.</p>
    * 
    * @return  
    * @url http://www.espruino.com/Reference#l_Puck_selfTest
    */
  def selfTest(): Boolean = js.native
}

