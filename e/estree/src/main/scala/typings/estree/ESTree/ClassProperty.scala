package typings.estree.ESTree

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassProperty extends StObject {
  
  var computed: Boolean
  
  var key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any
  
  var static: Boolean
  
  var typeAnnotation: js.UndefOr[TypeAnnotation | Null] = js.undefined
  
  var value: js.UndefOr[
    (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any) | Null
  ] = js.undefined
}
object ClassProperty {
  
  @scala.inline
  def apply(
    computed: Boolean,
    key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any,
    static: Boolean
  ): ClassProperty = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassProperty]
  }
  
  @scala.inline
  implicit class ClassPropertyMutableBuilder[Self <: ClassProperty] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any
    ): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotation(value: TypeAnnotation): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeAnnotationNull: Self = StObject.set(x, "typeAnnotation", null)
    
    @scala.inline
    def setTypeAnnotationUndefined: Self = StObject.set(x, "typeAnnotation", js.undefined)
    
    @scala.inline
    def setValue(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Expression */ js.Any
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
