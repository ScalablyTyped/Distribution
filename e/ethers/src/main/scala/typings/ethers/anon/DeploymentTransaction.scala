package typings.ethers.anon

import typings.ethers.typesContractWrappersMod.ContractTransactionResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentTransaction extends StObject {
  
  def deploymentTransaction(): ContractTransactionResponse
}
object DeploymentTransaction {
  
  inline def apply(deploymentTransaction: () => ContractTransactionResponse): DeploymentTransaction = {
    val __obj = js.Dynamic.literal(deploymentTransaction = js.Any.fromFunction0(deploymentTransaction))
    __obj.asInstanceOf[DeploymentTransaction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentTransaction] (val x: Self) extends AnyVal {
    
    inline def setDeploymentTransaction(value: () => ContractTransactionResponse): Self = StObject.set(x, "deploymentTransaction", js.Any.fromFunction0(value))
  }
}
