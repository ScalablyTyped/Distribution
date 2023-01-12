package typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProjectsDatabasesIndexesApiClientXgafvEnum extends StObject {
  
  var `1`: ProjectsDatabasesIndexesApiClientXgafv
  
  var `2`: ProjectsDatabasesIndexesApiClientXgafv
  
  def values(): js.Array[ProjectsDatabasesIndexesApiClientXgafv]
}
object IProjectsDatabasesIndexesApiClientXgafvEnum {
  
  inline def apply(
    `1`: ProjectsDatabasesIndexesApiClientXgafv,
    `2`: ProjectsDatabasesIndexesApiClientXgafv,
    values: () => js.Array[ProjectsDatabasesIndexesApiClientXgafv]
  ): IProjectsDatabasesIndexesApiClientXgafvEnum = {
    val __obj = js.Dynamic.literal(values = js.Any.fromFunction0(values))
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IProjectsDatabasesIndexesApiClientXgafvEnum]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IProjectsDatabasesIndexesApiClientXgafvEnum] (val x: Self) extends AnyVal {
    
    inline def set1(value: ProjectsDatabasesIndexesApiClientXgafv): Self = StObject.set(x, "1", value.asInstanceOf[js.Any])
    
    inline def set2(value: ProjectsDatabasesIndexesApiClientXgafv): Self = StObject.set(x, "2", value.asInstanceOf[js.Any])
    
    inline def setValues(value: () => js.Array[ProjectsDatabasesIndexesApiClientXgafv]): Self = StObject.set(x, "values", js.Any.fromFunction0(value))
  }
}
