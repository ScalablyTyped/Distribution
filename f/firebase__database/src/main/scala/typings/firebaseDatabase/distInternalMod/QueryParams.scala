package typings.firebaseDatabase.distInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/database/dist/internal", "_QueryParams")
@js.native
open class QueryParams () extends StObject {
  
  def copy(): QueryParams = js.native
  
  var endBeforeSet_ : Boolean = js.native
  
  var endNameSet_ : Boolean = js.native
  
  var endSet_ : Boolean = js.native
  
  def getIndex(): Index = js.native
  
  /**
    * Only valid to call if hasEnd() returns true.
    * Returns the end key name for the range defined by these query parameters
    */
  def getIndexEndName(): String = js.native
  
  /**
    * Only valid to call if hasEnd() returns true.
    */
  def getIndexEndValue(): Any = js.native
  
  /**
    * Only valid to call if hasStart() returns true.
    * Returns the starting key name for the range defined by these query parameters
    */
  def getIndexStartName(): String = js.native
  
  /**
    * Only valid to call if hasStart() returns true
    */
  def getIndexStartValue(): Any = js.native
  
  /**
    * Only valid to call if hasLimit() returns true
    */
  def getLimit(): Double = js.native
  
  /**
    * @returns True if a limit has been set and it has been explicitly anchored
    */
  def hasAnchoredLimit(): Boolean = js.native
  
  def hasEnd(): Boolean = js.native
  
  def hasLimit(): Boolean = js.native
  
  def hasStart(): Boolean = js.native
  
  var indexEndName_ : String = js.native
  
  var indexEndValue_ : Any | Null = js.native
  
  var indexStartName_ : String = js.native
  
  var indexStartValue_ : Any | Null = js.native
  
  var index_ : PriorityIndex = js.native
  
  def isDefault(): Boolean = js.native
  
  /**
    * @returns True if it would return from left.
    */
  def isViewFromLeft(): Boolean = js.native
  
  var limitSet_ : Boolean = js.native
  
  var limit_ : Double = js.native
  
  def loadsAllData(): Boolean = js.native
  
  var startAfterSet_ : Boolean = js.native
  
  var startNameSet_ : Boolean = js.native
  
  var startSet_ : Boolean = js.native
  
  var viewFrom_ : String = js.native
}
