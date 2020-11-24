package typings.dexie.mod

import typings.dexie.dexieStrings.dbcore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBCore extends js.Object {
  
  val MAX_KEY: js.Any = js.native
  
  val MIN_KEY: js.Any = js.native
  
  // Utility methods
  def cmp(a: js.Any, b: js.Any): Double = js.native
  
  val schema: DBCoreSchema = js.native
  
  var stack: dbcore = js.native
  
  def table(name: String): DBCoreTable = js.native
  
  // Transaction and Object Store
  def transaction(req: DBCoreTransactionRequest): DBCoreTransaction = js.native
}
object DBCore {
  
  @scala.inline
  def apply(
    MAX_KEY: js.Any,
    MIN_KEY: js.Any,
    cmp: (js.Any, js.Any) => Double,
    schema: DBCoreSchema,
    stack: dbcore,
    table: String => DBCoreTable,
    transaction: DBCoreTransactionRequest => DBCoreTransaction
  ): DBCore = {
    val __obj = js.Dynamic.literal(MAX_KEY = MAX_KEY.asInstanceOf[js.Any], MIN_KEY = MIN_KEY.asInstanceOf[js.Any], cmp = js.Any.fromFunction2(cmp), schema = schema.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], table = js.Any.fromFunction1(table), transaction = js.Any.fromFunction1(transaction))
    __obj.asInstanceOf[DBCore]
  }
  
  @scala.inline
  implicit class DBCoreOps[Self <: DBCore] (val x: Self) extends AnyVal {
    
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
    def setMAX_KEY(value: js.Any): Self = this.set("MAX_KEY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIN_KEY(value: js.Any): Self = this.set("MIN_KEY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCmp(value: (js.Any, js.Any) => Double): Self = this.set("cmp", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSchema(value: DBCoreSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: dbcore): Self = this.set("stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: String => DBCoreTable): Self = this.set("table", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransaction(value: DBCoreTransactionRequest => DBCoreTransaction): Self = this.set("transaction", js.Any.fromFunction1(value))
  }
}
