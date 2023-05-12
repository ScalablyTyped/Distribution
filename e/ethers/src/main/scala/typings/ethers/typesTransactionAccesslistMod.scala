package typings.ethers

import typings.ethers.typesTransactionMod.AccessList
import typings.ethers.typesTransactionMod.AccessListish
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransactionAccesslistMod {
  
  @JSImport("ethers/types/transaction/accesslist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def accessListify(value: AccessListish): AccessList = ^.asInstanceOf[js.Dynamic].applyDynamic("accessListify")(value.asInstanceOf[js.Any]).asInstanceOf[AccessList]
}
