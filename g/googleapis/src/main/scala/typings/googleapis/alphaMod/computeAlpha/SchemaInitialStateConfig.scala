package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Initial State for shielded instance, these are public keys which are safe
  * to store in public
  */
@js.native
trait SchemaInitialStateConfig extends js.Object {
  
  /**
    * The Key Database (db).
    */
  var dbs: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.native
  
  /**
    * The forbidden key database (dbx).
    */
  var dbxs: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.native
  
  /**
    * The Key Exchange Key (KEK).
    */
  var keks: js.UndefOr[js.Array[SchemaFileContentBuffer]] = js.native
  
  /**
    * The Platform Key (PK).
    */
  var pk: js.UndefOr[SchemaFileContentBuffer] = js.native
}
object SchemaInitialStateConfig {
  
  @scala.inline
  def apply(): SchemaInitialStateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInitialStateConfig]
  }
  
  @scala.inline
  implicit class SchemaInitialStateConfigOps[Self <: SchemaInitialStateConfig] (val x: Self) extends AnyVal {
    
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
    def setDbsVarargs(value: SchemaFileContentBuffer*): Self = this.set("dbs", js.Array(value :_*))
    
    @scala.inline
    def setDbs(value: js.Array[SchemaFileContentBuffer]): Self = this.set("dbs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbs: Self = this.set("dbs", js.undefined)
    
    @scala.inline
    def setDbxsVarargs(value: SchemaFileContentBuffer*): Self = this.set("dbxs", js.Array(value :_*))
    
    @scala.inline
    def setDbxs(value: js.Array[SchemaFileContentBuffer]): Self = this.set("dbxs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbxs: Self = this.set("dbxs", js.undefined)
    
    @scala.inline
    def setKeksVarargs(value: SchemaFileContentBuffer*): Self = this.set("keks", js.Array(value :_*))
    
    @scala.inline
    def setKeks(value: js.Array[SchemaFileContentBuffer]): Self = this.set("keks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeks: Self = this.set("keks", js.undefined)
    
    @scala.inline
    def setPk(value: SchemaFileContentBuffer): Self = this.set("pk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePk: Self = this.set("pk", js.undefined)
  }
}
