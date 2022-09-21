package typings.fireo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fireo", "Model")
@js.native
open class Model () extends MetaModel {
  
  def delete(): js.Promise[Unit] = js.native
  def delete(options: DeleteModelOptions): js.Promise[Unit] = js.native
  
  def fromObject(map: js.Object): Model = js.native
  
  def save(): js.Promise[Unit] = js.native
  def save(options: SaveModelOptions): js.Promise[Unit] = js.native
  
  def toObject(): js.Object = js.native
  
  def update(): js.Promise[Unit] = js.native
  def update(options: UpdateModelOptions): js.Promise[Unit] = js.native
  
  def upsert(): js.Promise[Unit] = js.native
  def upsert(options: UpsertModelOptions): js.Promise[Unit] = js.native
}
/* static members */
object Model {
  
  @JSImport("fireo", "Model")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromObject(map: js.Object): Model = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(map.asInstanceOf[js.Any]).asInstanceOf[Model]
  
  inline def init(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("init")().asInstanceOf[Any]
  inline def init(options: ModelOptions): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(options.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def parent(): Model = ^.asInstanceOf[js.Dynamic].applyDynamic("parent")().asInstanceOf[Model]
  inline def parent(key: String): Model = ^.asInstanceOf[js.Dynamic].applyDynamic("parent")(key.asInstanceOf[js.Any]).asInstanceOf[Model]
}
