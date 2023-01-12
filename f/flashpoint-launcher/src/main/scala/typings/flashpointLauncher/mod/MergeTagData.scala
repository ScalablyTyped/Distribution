package typings.flashpointLauncher.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data passed to merge tags together
  * @param toMerge Tag to merge from
  * @param mergeInto Tag to merge into
  * @param makeAlias Whether to move all aliases from toMerge into mergeInto as well
  */
trait MergeTagData extends StObject {
  
  var makeAlias: Boolean
  
  var mergeInto: String
  
  var toMerge: String
}
object MergeTagData {
  
  inline def apply(makeAlias: Boolean, mergeInto: String, toMerge: String): MergeTagData = {
    val __obj = js.Dynamic.literal(makeAlias = makeAlias.asInstanceOf[js.Any], mergeInto = mergeInto.asInstanceOf[js.Any], toMerge = toMerge.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeTagData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MergeTagData] (val x: Self) extends AnyVal {
    
    inline def setMakeAlias(value: Boolean): Self = StObject.set(x, "makeAlias", value.asInstanceOf[js.Any])
    
    inline def setMergeInto(value: String): Self = StObject.set(x, "mergeInto", value.asInstanceOf[js.Any])
    
    inline def setToMerge(value: String): Self = StObject.set(x, "toMerge", value.asInstanceOf[js.Any])
  }
}
