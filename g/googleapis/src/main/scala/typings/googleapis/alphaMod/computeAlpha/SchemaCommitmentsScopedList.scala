package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaCommitmentsScopedList extends StObject {
  
  /**
    * [Output Only] A list of commitments contained in this scope.
    */
  var commitments: js.UndefOr[js.Array[SchemaCommitment]] = js.native
  
  /**
    * [Output Only] Informational warning which replaces the list of
    * commitments when the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}
object SchemaCommitmentsScopedList {
  
  @scala.inline
  def apply(): SchemaCommitmentsScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCommitmentsScopedList]
  }
  
  @scala.inline
  implicit class SchemaCommitmentsScopedListMutableBuilder[Self <: SchemaCommitmentsScopedList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitments(value: js.Array[SchemaCommitment]): Self = StObject.set(x, "commitments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitmentsUndefined: Self = StObject.set(x, "commitments", js.undefined)
    
    @scala.inline
    def setCommitmentsVarargs(value: SchemaCommitment*): Self = StObject.set(x, "commitments", js.Array(value :_*))
    
    @scala.inline
    def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
