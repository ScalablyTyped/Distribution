package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassMSSQL
  extends StObject
     with ClassDbConnection {
  
  /**
    * 
    * @brief 选择当前数据库连接的缺省数据库
    * @param dbName 指定数据库名
    * 
    * 
    * @async
    */
  def use(dbName: String): Unit = js.native
}
