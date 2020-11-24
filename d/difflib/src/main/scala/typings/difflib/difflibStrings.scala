package typings.difflib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object difflibStrings {
  
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @scala.inline
  def equal: equal = "equal".asInstanceOf[equal]
  
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait delete extends js.Object
  
  @js.native
  sealed trait equal extends js.Object
  
  @js.native
  sealed trait insert extends js.Object
  
  @js.native
  sealed trait replace extends js.Object
}
