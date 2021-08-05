package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A list of package names.
  */
trait SchemaPackageNameList extends StObject {
  
  /**
    * A list of package names.
    */
  var packageNames: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaPackageNameList {
  
  inline def apply(): SchemaPackageNameList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPackageNameList]
  }
  
  extension [Self <: SchemaPackageNameList](x: Self) {
    
    inline def setPackageNames(value: js.Array[String]): Self = StObject.set(x, "packageNames", value.asInstanceOf[js.Any])
    
    inline def setPackageNamesUndefined: Self = StObject.set(x, "packageNames", js.undefined)
    
    inline def setPackageNamesVarargs(value: String*): Self = StObject.set(x, "packageNames", js.Array(value :_*))
  }
}
