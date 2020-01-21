package typings.dojo.dojox.math

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.math.random")
@js.native
object random extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/math/random/Secure.html
    *
    * Super simple implementation of a random number generator,
    * which relies on Math.random().
    *
    * @param prng function that returns an instance of PRNG (pseudo random number generator)with two methods: init(array) and next(). It should have a property "size"to indicate the required pool size.
    * @param noEvents       Optionalif false or absent, onclick and onkeypress event will be used to add"randomness", otherwise events will not be used.
    */
  @js.native
  class Secure protected () extends js.Object {
    def this(prng: js.Function) = this()
    def this(prng: js.Function, noEvents: Boolean) = this()
    /**
      * Disconnects events, if any, preparing the object for GC.
      *
      */
    def destroy(): Unit = js.native
    /**
      * Fills in an array of bytes with random numbers
      *
      * @param byteArray array to be filled in with random numbers, only existingelements will be filled.
      */
    def nextBytes(byteArray: js.Array[_]): Unit = js.native
    /**
      * Mix in the current time (w/milliseconds) into the pool
      *
      */
    def seedTime(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/math/random/Simple.html
    *
    * Super simple implementation of a random number generator,
    * which relies on Math.random().
    *
    */
  @js.native
  class Simple () extends js.Object {
    /**
      * Prepares the object for GC. (empty in this case)
      *
      */
    def destroy(): Unit = js.native
    /**
      * Fills in an array of bytes with random numbers
      *
      * @param byteArray array to be filled in with random numbers, only existingelements will be filled.
      */
    def nextBytes(byteArray: js.Array[_]): Unit = js.native
  }
  
  @js.native
  object prng4 extends js.Object {
    /**
      *
      */
    var size: Double = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/math/random/prng4.html
    *
    *
    */
  type prng4 = js.Function0[Unit]
}

