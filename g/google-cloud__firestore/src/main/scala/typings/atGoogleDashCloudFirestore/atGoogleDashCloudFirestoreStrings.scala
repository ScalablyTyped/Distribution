package typings.atGoogleDashCloudFirestore

import typings.atGoogleDashCloudFirestore.FirebaseFirestore.DocumentChangeType
import typings.atGoogleDashCloudFirestore.FirebaseFirestore.OrderByDirection
import typings.atGoogleDashCloudFirestore.FirebaseFirestore.WhereFilterOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object atGoogleDashCloudFirestoreStrings {
  @js.native
  sealed trait `<` extends WhereFilterOp
  
  @js.native
  sealed trait `<=` extends WhereFilterOp
  
  @js.native
  sealed trait `==` extends WhereFilterOp
  
  @js.native
  sealed trait `>` extends WhereFilterOp
  
  @js.native
  sealed trait `>=` extends WhereFilterOp
  
  @js.native
  sealed trait added extends DocumentChangeType
  
  @js.native
  sealed trait `array-contains` extends WhereFilterOp
  
  @js.native
  sealed trait asc extends OrderByDirection
  
  @js.native
  sealed trait desc extends OrderByDirection
  
  @js.native
  sealed trait modified extends DocumentChangeType
  
  @js.native
  sealed trait removed extends DocumentChangeType
  
  @scala.inline
  def `<`: `<` = "<".asInstanceOf[`<`]
  @scala.inline
  def `<=`: `<=` = "<=".asInstanceOf[`<=`]
  @scala.inline
  def `==`: `==` = "==".asInstanceOf[`==`]
  @scala.inline
  def `>`: `>` = ">".asInstanceOf[`>`]
  @scala.inline
  def `>=`: `>=` = ">=".asInstanceOf[`>=`]
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  @scala.inline
  def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def modified: modified = "modified".asInstanceOf[modified]
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
}

