package typings.googleAppsScript.GoogleAppsScript.Document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Range that has a name and ID to allow later retrieval. Names are not
  * necessarily unique; several different ranges in the same document may share the same name, much
  * like a class in HTML. By contrast, IDs are unique within the document, like an ID in HTML. Once a
  * NamedRange has been added to a document, it cannot be modified, only removed.
  *
  * A NamedRange can be accessed by any script that accesses the document. To avoid
  * unintended conflicts between scripts, consider prefixing range names with a unique string.
  *
  *     // Create a named range that includes every table in the document.
  *     var doc = DocumentApp.getActiveDocument();
  *     var rangeBuilder = doc.newRange();
  *     var tables = doc.getBody().getTables();
  *     for (var i = 0; i < tables.length; i++) {
  *       rangeBuilder.addElement(tables[i]);
  *     }
  *     doc.addNamedRange('myUniquePrefix-tables', rangeBuilder.build());
  */
@js.native
trait NamedRange extends js.Object {
  
  def getId(): String = js.native
  
  def getName(): String = js.native
  
  def getRange(): Range = js.native
  
  def remove(): Unit = js.native
}
object NamedRange {
  
  @scala.inline
  def apply(getId: () => String, getName: () => String, getRange: () => Range, remove: () => Unit): NamedRange = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getName = js.Any.fromFunction0(getName), getRange = js.Any.fromFunction0(getRange), remove = js.Any.fromFunction0(remove))
    __obj.asInstanceOf[NamedRange]
  }
  
  @scala.inline
  implicit class NamedRangeOps[Self <: NamedRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetId(value: () => String): Self = this.set("getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetName(value: () => String): Self = this.set("getName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRange(value: () => Range): Self = this.set("getRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: () => Unit): Self = this.set("remove", js.Any.fromFunction0(value))
  }
}
