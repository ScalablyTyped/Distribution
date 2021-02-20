package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the settings defining a data record.
  */
@js.native
trait DataRecordOptions extends StObject {
  
  /**
    * Gets or sets the index of the active data record.
    */
  var activeRecordIndex: Double = js.native
  
  /**
    * Gets or sets the count of data source records.
    */
  var recordCount: Double = js.native
}
object DataRecordOptions {
  
  @scala.inline
  def apply(activeRecordIndex: Double, recordCount: Double): DataRecordOptions = {
    val __obj = js.Dynamic.literal(activeRecordIndex = activeRecordIndex.asInstanceOf[js.Any], recordCount = recordCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRecordOptions]
  }
  
  @scala.inline
  implicit class DataRecordOptionsMutableBuilder[Self <: DataRecordOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveRecordIndex(value: Double): Self = StObject.set(x, "activeRecordIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordCount(value: Double): Self = StObject.set(x, "recordCount", value.asInstanceOf[js.Any])
  }
}
