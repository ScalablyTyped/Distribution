package typings.firebaseFirestore.userDataReaderMod

import typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`2`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`3`
import typings.firebaseFirestore.firebaseFirestoreNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`0`
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`1`
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`2`
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`3`
  - typings.firebaseFirestore.firebaseFirestoreNumbers.`4`
*/
trait UserDataSource extends js.Object

object UserDataSource {
  /**
    * Indicates the source is a where clause, cursor bound, arrayUnion()
    * element, etc. Of note, isWrite(source) will return false.
    */
  @scala.inline
  def Argument: `3` = 3.asInstanceOf[`3`]
  /**
    * Indicates that the source is an Argument that may directly contain nested
    * arrays (e.g. the operand of an `in` query).
    */
  @scala.inline
  def ArrayArgument: `4` = 4.asInstanceOf[`4`]
  @scala.inline
  def MergeSet: `2` = 2.asInstanceOf[`2`]
  @scala.inline
  def Set: `0` = 0.asInstanceOf[`0`]
  @scala.inline
  def Update: `1` = 1.asInstanceOf[`1`]
}

