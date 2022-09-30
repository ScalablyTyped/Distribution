package typings.googleCloudSpanner.protosMod.google.spanner.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a Type. */
trait IType extends StObject {
  
  /** Type arrayElementType */
  var arrayElementType: js.UndefOr[IType | Null] = js.undefined
  
  /** Type code */
  var code: js.UndefOr[
    TypeCode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.TypeCode * / any */ String) | Null
  ] = js.undefined
  
  /** Type structType */
  var structType: js.UndefOr[IStructType | Null] = js.undefined
  
  /** Type typeAnnotation */
  var typeAnnotation: js.UndefOr[
    TypeAnnotationCode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.TypeAnnotationCode * / any */ String) | Null
  ] = js.undefined
}
object IType {
  
  inline def apply(): IType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IType]
  }
  
  extension [Self <: IType](x: Self) {
    
    inline def setArrayElementType(value: IType): Self = StObject.set(x, "arrayElementType", value.asInstanceOf[js.Any])
    
    inline def setArrayElementTypeNull: Self = StObject.set(x, "arrayElementType", null)
    
    inline def setArrayElementTypeUndefined: Self = StObject.set(x, "arrayElementType", js.undefined)
    
    inline def setCode(
      value: TypeCode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.TypeCode * / any */ String)
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeNull: Self = StObject.set(x, "code", null)
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setStructType(value: IStructType): Self = StObject.set(x, "structType", value.asInstanceOf[js.Any])
    
    inline def setStructTypeNull: Self = StObject.set(x, "structType", null)
    
    inline def setStructTypeUndefined: Self = StObject.set(x, "structType", js.undefined)
    
    inline def setTypeAnnotation(
      value: TypeAnnotationCode | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.spanner.v1.TypeAnnotationCode * / any */ String)
    ): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    inline def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
  }
}
