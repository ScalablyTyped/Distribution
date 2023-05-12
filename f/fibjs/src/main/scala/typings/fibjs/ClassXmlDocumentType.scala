package typings.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassXmlDocumentType
  extends StObject
     with ClassXmlNode {
  
  /**
    * class prop
    *
    *
    * @brief 返回 DTD 的名称
    *
    *
    * @readonly
    *
    */
  var name: String = js.native
  
  /**
    * class prop
    *
    *
    * @brief 可返回外部 DTD 的公共识别符
    *
    *
    * @readonly
    *
    */
  var publicId: String = js.native
  
  /**
    * class prop
    *
    *
    * @brief 可返回外部 DTD 的系统识别符
    *
    *
    * @readonly
    *
    */
  var systemId: String = js.native
}
