package typings.devextreme.mod.DevExpress.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxGantt extends Widget {
  
  /**
    * [descr:dxGantt.assignResourceToTask(resourceKey, taskKey)]
    */
  def assignResourceToTask(resourceKey: js.Any, taskKey: js.Any): Unit = js.native
  
  /**
    * [descr:dxGantt.deleteDependency(key)]
    */
  def deleteDependency(key: js.Any): Unit = js.native
  
  /**
    * [descr:dxGantt.deleteResource(key)]
    */
  def deleteResource(key: js.Any): Unit = js.native
  
  /**
    * [descr:dxGantt.deleteTask(key)]
    */
  def deleteTask(key: js.Any): Unit = js.native
  
  /**
    * [descr:dxGantt.getDependencyData(key)]
    */
  def getDependencyData(key: js.Any): js.Any = js.native
  
  /**
    * [descr:dxGantt.getResourceAssignmentData(key)]
    */
  def getResourceAssignmentData(key: js.Any): js.Any = js.native
  
  /**
    * [descr:dxGantt.getResourceData(key)]
    */
  def getResourceData(key: js.Any): js.Any = js.native
  
  /**
    * [descr:dxGantt.getTaskData(key)]
    */
  def getTaskData(key: js.Any): js.Any = js.native
  
  /**
    * [descr:dxGantt.getTaskResources(key)]
    */
  def getTaskResources(key: js.Any): js.Array[_] = js.native
  
  /**
    * [descr:dxGantt.getVisibleDependencyKeys()]
    */
  def getVisibleDependencyKeys(): js.Array[_] = js.native
  
  /**
    * [descr:dxGantt.getVisibleResourceAssignmentKeys()]
    */
  def getVisibleResourceAssignmentKeys(): js.Array[_] = js.native
  
  /**
    * [descr:dxGantt.getVisibleResourceKeys()]
    */
  def getVisibleResourceKeys(): js.Array[_] = js.native
  
  /**
    * [descr:dxGantt.getVisibleTaskKeys()]
    */
  def getVisibleTaskKeys(): js.Array[_] = js.native
  
  /**
    * [descr:dxGantt.insertDependency(data)]
    */
  def insertDependency(data: js.Any): Unit = js.native
  
  /**
    * [descr:dxGantt.insertResource(data, taskKeys)]
    */
  def insertResource(data: js.Any): Unit = js.native
  def insertResource(data: js.Any, taskKeys: js.Array[_]): Unit = js.native
  
  /**
    * [descr:dxGantt.insertTask(data)]
    */
  def insertTask(data: js.Any): Unit = js.native
  
  /**
    * [descr:dxGantt.unassignResourceFromTask(resourceKey, taskKey)]
    */
  def unassignResourceFromTask(resourceKey: js.Any, taskKey: js.Any): Unit = js.native
  
  /**
    * [descr:dxGantt.updateTask(key, data)]
    */
  def updateTask(key: js.Any, data: js.Any): Unit = js.native
}
