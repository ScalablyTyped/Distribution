package typings.factoryGirlObjectionAdapter

import org.scalablytyped.runtime.Instantiable0
import typings.factoryGirlObjectionAdapter.anon.Id
import typings.std.Partial
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("factory-girl-objection-adapter", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ObjectionAdapter {
    
    /* CompleteClass */
    override def build[T /* <: Id */](Model: ObjectionModelConstructor[T], props: Partial[T]): T = js.native
    
    /* CompleteClass */
    override def destroy[T /* <: Id */](model: T, Model: ObjectionModelConstructor[T]): js.Promise[Double] = js.native
    
    /* CompleteClass */
    override def get[T, K /* <: /* keyof T */ String */](model: T, attr: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any = js.native
    
    /* CompleteClass */
    override def save[T /* <: Id */](model: T, Model: ObjectionModelConstructor[T]): js.Promise[T] = js.native
  }
  
  trait ObjectionAdapter extends StObject {
    
    def build[T /* <: Id */](Model: ObjectionModelConstructor[T], props: Partial[T]): T
    
    def destroy[T /* <: Id */](model: T, Model: ObjectionModelConstructor[T]): js.Promise[Double]
    
    def get[T, K /* <: /* keyof T */ String */](model: T, attr: K): /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
    
    def save[T /* <: Id */](model: T, Model: ObjectionModelConstructor[T]): js.Promise[T]
  }
  object ObjectionAdapter {
    
    inline def apply(
      build: (ObjectionModelConstructor[Any], Partial[Any]) => Any,
      destroy: (Any, ObjectionModelConstructor[Any]) => js.Promise[Double],
      get: (Any, Any) => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any,
      save: (Any, ObjectionModelConstructor[Any]) => js.Promise[Any]
    ): ObjectionAdapter = {
      val __obj = js.Dynamic.literal(build = js.Any.fromFunction2(build), destroy = js.Any.fromFunction2(destroy), get = js.Any.fromFunction2(get), save = js.Any.fromFunction2(save))
      __obj.asInstanceOf[ObjectionAdapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectionAdapter] (val x: Self) extends AnyVal {
      
      inline def setBuild(value: (ObjectionModelConstructor[Any], Partial[Any]) => Any): Self = StObject.set(x, "build", js.Any.fromFunction2(value))
      
      inline def setDestroy(value: (Any, ObjectionModelConstructor[Any]) => js.Promise[Double]): Self = StObject.set(x, "destroy", js.Any.fromFunction2(value))
      
      inline def setGet(
        value: (Any, Any) => /* import warning: importer.ImportType#apply Failed type conversion: T[K] */ js.Any
      ): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setSave(value: (Any, ObjectionModelConstructor[Any]) => js.Promise[Any]): Self = StObject.set(x, "save", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait ObjectionModelConstructor[T /* <: Id */]
    extends StObject
       with Instantiable0[T] {
    
    def query(): ObjectionQueryBuilder[T] = js.native
  }
  
  trait ObjectionQueryBuilder[T /* <: Id */] extends StObject {
    
    @JSName("deleteById")
    def deleteById_id(id: /* import warning: importer.ImportType#apply Failed type conversion: T['id'] */ js.Any): PromiseLike[Double]
    
    def insert(model: T): PromiseLike[T]
  }
  object ObjectionQueryBuilder {
    
    inline def apply[T /* <: Id */](
      deleteById: /* import warning: importer.ImportType#apply Failed type conversion: T['id'] */ js.Any => PromiseLike[Double],
      insert: T => PromiseLike[T]
    ): ObjectionQueryBuilder[T] = {
      val __obj = js.Dynamic.literal(deleteById = js.Any.fromFunction1(deleteById), insert = js.Any.fromFunction1(insert))
      __obj.asInstanceOf[ObjectionQueryBuilder[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ObjectionQueryBuilder[?], T /* <: Id */] (val x: Self & ObjectionQueryBuilder[T]) extends AnyVal {
      
      inline def setDeleteById(
        value: /* import warning: importer.ImportType#apply Failed type conversion: T['id'] */ js.Any => PromiseLike[Double]
      ): Self = StObject.set(x, "deleteById", js.Any.fromFunction1(value))
      
      inline def setInsert(value: T => PromiseLike[T]): Self = StObject.set(x, "insert", js.Any.fromFunction1(value))
    }
  }
}
