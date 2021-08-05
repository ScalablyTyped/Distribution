package typings.fsJetpack.typesMod

import typings.fsJetpack.fsJetpackStrings.dir
import typings.fsJetpack.fsJetpackStrings.file
import typings.fsJetpack.fsJetpackStrings.symlink
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InspectTreeResult
  extends StObject
     with InspectResult {
  
  var children: js.Array[InspectTreeResult]
  
  var relativePath: String
}
object InspectTreeResult {
  
  inline def apply(
    children: js.Array[InspectTreeResult],
    name: String,
    relativePath: String,
    size: Double,
    `type`: file | dir | symlink
  ): InspectTreeResult = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectTreeResult]
  }
  
  extension [Self <: InspectTreeResult](x: Self) {
    
    inline def setChildren(value: js.Array[InspectTreeResult]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: InspectTreeResult*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    inline def setRelativePath(value: String): Self = StObject.set(x, "relativePath", value.asInstanceOf[js.Any])
  }
}
