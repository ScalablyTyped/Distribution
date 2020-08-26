package typings.dexie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBCoreIndex extends js.Object {
  /** Auto-generated primary key (does not apply to secondary indexes) */
  val autoIncrement: js.UndefOr[Boolean] = js.native
  /** True if and only if keyPath is an array (http://dexie.org/docs/Compound-Index) */
  val compound: js.UndefOr[Boolean] = js.native
  /** True if this index represents the primary key */
  val isPrimaryKey: js.UndefOr[Boolean] = js.native
  /** keyPath, null for primary key, string for single-property indexes, Array<string> for compound indexes */
  val keyPath: Null | String | js.Array[String] = js.native
  /** Whether index is multiEntry. */
  val multiEntry: js.UndefOr[Boolean] = js.native
  /** Name of the index, or null for primary key */
  val name: String | Null = js.native
  /** True if this index represents the primary key and is not inbound (http://dexie.org/docs/inbound) */
  val outbound: js.UndefOr[Boolean] = js.native
  /** Whether index is unique. Also true if index is primary key. */
  val unique: js.UndefOr[Boolean] = js.native
  /** Extract (using keyPath) a key from given value (object) */
  def extractKey(value: js.Any): js.Any = js.native
}

object DBCoreIndex {
  @scala.inline
  def apply(extractKey: js.Any => js.Any): DBCoreIndex = {
    val __obj = js.Dynamic.literal(extractKey = js.Any.fromFunction1(extractKey))
    __obj.asInstanceOf[DBCoreIndex]
  }
  @scala.inline
  implicit class DBCoreIndexOps[Self <: DBCoreIndex] (val x: Self) extends AnyVal {
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
    def setExtractKey(value: js.Any => js.Any): Self = this.set("extractKey", js.Any.fromFunction1(value))
    @scala.inline
    def setAutoIncrement(value: Boolean): Self = this.set("autoIncrement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoIncrement: Self = this.set("autoIncrement", js.undefined)
    @scala.inline
    def setCompound(value: Boolean): Self = this.set("compound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompound: Self = this.set("compound", js.undefined)
    @scala.inline
    def setIsPrimaryKey(value: Boolean): Self = this.set("isPrimaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrimaryKey: Self = this.set("isPrimaryKey", js.undefined)
    @scala.inline
    def setKeyPathVarargs(value: String*): Self = this.set("keyPath", js.Array(value :_*))
    @scala.inline
    def setKeyPath(value: String | js.Array[String]): Self = this.set("keyPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyPathNull: Self = this.set("keyPath", null)
    @scala.inline
    def setMultiEntry(value: Boolean): Self = this.set("multiEntry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiEntry: Self = this.set("multiEntry", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    @scala.inline
    def setOutbound(value: Boolean): Self = this.set("outbound", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutbound: Self = this.set("outbound", js.undefined)
    @scala.inline
    def setUnique(value: Boolean): Self = this.set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnique: Self = this.set("unique", js.undefined)
  }
  
}

