package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StringDictionary
import typings.googleCloudSpanner.protosMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Session. */
trait ISession extends StObject {
  
  /** Session approximateLastUseTime */
  var approximateLastUseTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Session createTime */
  var createTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Session creatorRole */
  var creatorRole: js.UndefOr[String | Null] = js.undefined
  
  /** Session labels */
  var labels: js.UndefOr[StringDictionary[String] | Null] = js.undefined
  
  /** Session name */
  var name: js.UndefOr[String | Null] = js.undefined
}
object ISession {
  
  inline def apply(): ISession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISession]
  }
  
  extension [Self <: ISession](x: Self) {
    
    inline def setApproximateLastUseTime(value: ITimestamp): Self = StObject.set(x, "approximateLastUseTime", value.asInstanceOf[js.Any])
    
    inline def setApproximateLastUseTimeNull: Self = StObject.set(x, "approximateLastUseTime", null)
    
    inline def setApproximateLastUseTimeUndefined: Self = StObject.set(x, "approximateLastUseTime", js.undefined)
    
    inline def setCreateTime(value: ITimestamp): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreatorRole(value: String): Self = StObject.set(x, "creatorRole", value.asInstanceOf[js.Any])
    
    inline def setCreatorRoleNull: Self = StObject.set(x, "creatorRole", null)
    
    inline def setCreatorRoleUndefined: Self = StObject.set(x, "creatorRole", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsNull: Self = StObject.set(x, "labels", null)
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
