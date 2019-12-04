package typings.dojo.dojox.uuid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.uuid.Uuid")
@js.native
object Uuid extends js.Object {
  /**
    * Compares this UUID to another UUID, and returns 0, 1, or -1.
    * This implementation is intended to match the sample implementation
    * in IETF RFC 4122: http://www.ietf.org/rfc/rfc4122.txt
    *
    * @param otherUuid
    */
  /**
    * Given two UUIDs to compare, this method returns 0, 1, or -1.
    * This method is designed to be used by sorting routines, like the
    * JavaScript built-in Array sort() method. This implementation is
    * intended to match the sample implementation in IETF RFC 4122:
    * http://www.ietf.org/rfc/rfc4122.txt
    *
    * @param uuidOne
    * @param uuidTwo
    */
  @js.native
  trait compare extends js.Object {
    def apply(otherUuid: Uuid): Unit = js.native
    def apply(uuidOne: Uuid, uuidTwo: Uuid): Unit = js.native
  }
  
  /**
    * Returns the default generator.  See setGenerator().
    *
    */
  type getGenerator = js.Function0[Unit]
  /**
    * If this is a version 1 UUID (a time-based UUID), getNode() returns a
    * 12-character string with the "node" or "pseudonode" portion of the UUID,
    * which is the rightmost 12 characters.
    *
    */
  type getNode = js.Function0[Unit]
  /**
    * If this is a version 1 UUID (a time-based UUID), this method returns
    * the timestamp value encoded in the UUID.  The caller can ask for the
    * timestamp to be returned either as a JavaScript Date object or as a
    * 15-character string of hex digits.
    *
    * @param returnType               Optional
    */
  type getTimestamp = js.Function1[/* returnType */ String, js.Any]
  /**
    * Returns a variant code that indicates what type of UUID this is.
    * Returns one of the enumerated dojox.uuid.variant values.
    *
    */
  type getVariant = js.Function0[Unit]
  /**
    * Returns a version number that indicates what type of UUID this is.
    * Returns one of the enumerated dojox.uuid.version values.
    *
    */
  type getVersion = js.Function0[Unit]
  /**
    * Returns true if this UUID is equal to the otherUuid, or false otherwise.
    *
    * @param otherUuid
    */
  type isEqual = js.Function1[/* otherUuid */ Uuid, Unit]
  /**
    * Returns true if the UUID was initialized with a valid value.
    *
    */
  type isValid = js.Function0[Unit]
  /**
    * Sets the default generator, which will be used by the
    * "new dojox.uuid.Uuid()" constructor if no parameters
    * are passed in.
    *
    * @param generator               Optional
    */
  type setGenerator = js.Function1[/* generator */ js.Function, Unit]
  /**
    * This method returns a standard 36-character string representing
    * the UUID, such as "3b12f1df-5232-4804-897e-917bf397618a".
    *
    */
  type toString = js.Function0[Unit]
}

