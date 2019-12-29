package typings.dojo.dojox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.gantt")
@js.native
object gantt extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/gantt/GanttChart.html
    *
    *
    * @param configuration
    * @param node
    */
  @js.native
  class GanttChart protected () extends js.Object {
    def this(configuration: js.Any, node: js.Any) = this()
    /**
      *
      * @param row
      */
    def addDayInPanelTime(row: js.Any): Unit = js.native
    /**
      *
      * @param row
      */
    def addHourInPanelTime(row: js.Any): Unit = js.native
    /**
      *
      * @param row
      * @param count
      * @param month
      * @param year
      */
    def addMonthInPanelTime(row: js.Any, count: js.Any, month: js.Any, year: js.Any): Unit = js.native
    /**
      *
      * @param projectItem
      */
    def addProject(projectItem: js.Any): Unit = js.native
    /**
      *
      * @param row
      * @param count
      * @param week
      */
    def addWeekInPanelTime(row: js.Any, count: js.Any, week: js.Any): Unit = js.native
    /**
      *
      * @param row
      * @param count
      * @param year
      */
    def addYearInPanelTime(row: js.Any, count: js.Any, year: js.Any): Unit = js.native
    /**
      *
      */
    def adjustPanelTime(): Unit = js.native
    /**
      *
      * @param parentTask
      * @param childTaskItems
      */
    def buildChildTasksData(parentTask: js.Any, childTaskItems: js.Any): Unit = js.native
    /**
      *
      */
    def buildUIContent(): Unit = js.native
    /**
      *
      */
    def checkHeighPanelTasks(): Unit = js.native
    /**
      *
      * @param parentTask
      * @param task
      */
    def checkPosParentTask(parentTask: js.Any, task: js.Any): Boolean = js.native
    /**
      *
      * @param parentTask
      */
    def checkPosParentTaskInTree(parentTask: js.Any): js.Any = js.native
    /**
      *
      * @param predTask
      * @param task
      */
    def checkPosPreviousTask(predTask: js.Any, task: js.Any): Boolean = js.native
    /**
      *
      */
    def checkPosition(): Unit = js.native
    /**
      *
      */
    def clearAll(): Unit = js.native
    /**
      *
      */
    def clearData(): Unit = js.native
    /**
      *
      */
    def clearEvents(): Unit = js.native
    /**
      *
      */
    def clearItems(): Unit = js.native
    /**
      *
      * @param parentTask
      * @param ctask
      */
    def correctPosParentTask(parentTask: js.Any, ctask: js.Any): Unit = js.native
    /**
      *
      * @param predTask
      * @param ctask
      * @param ctaskObj
      */
    def correctPosPreviousTask(predTask: js.Any, ctask: js.Any, ctaskObj: js.Any): Unit = js.native
    /**
      *
      * @param arrChildTasks
      * @param project
      */
    def createChildItemControls(arrChildTasks: js.Any, project: js.Any): Unit = js.native
    /**
      *
      */
    def createPanelNamesTasks(): js.Any = js.native
    /**
      *
      */
    def createPanelNamesTasksHeader(): js.Any = js.native
    /**
      *
      */
    def createPanelTasks(): js.Any = js.native
    /**
      *
      */
    def createPanelTime(): js.Any = js.native
    /**
      *
      * @param project
      */
    def createTasks(project: js.Any): Unit = js.native
    /**
      *
      * @param id
      */
    def deleteProject(id: js.Any): Unit = js.native
    /**
      *
      * @param childTasks
      */
    def getChildTasksData(childTasks: js.Any): js.Array[_] = js.native
    /**
      *
      */
    def getCountDays(): js.Any = js.native
    /**
      *
      */
    def getJSONData(): js.Object = js.native
    /**
      *
      * @param task
      */
    def getLastChildTask(task: js.Any): js.Any = js.native
    /**
      *
      * @param task
      */
    def getLastCloseParent(task: js.Any): js.Any = js.native
    /**
      *
      * @param startTime
      */
    def getPosOnDate(startTime: js.Any): Double = js.native
    /**
      *
      * @param id
      */
    def getProject(id: js.Any): js.Any = js.native
    /**
      *
      * @param id
      */
    def getProjectItemById(id: js.Any): js.Any = js.native
    /**
      *
      */
    def getStartDate(): js.Any = js.native
    /**
      *
      * @param duration
      */
    def getWidthOnDuration(duration: js.Any): js.Any = js.native
    /**
      *
      * @param height
      */
    def incHeightPanelNames(height: js.Any): Unit = js.native
    /**
      *
      * @param height
      */
    def incHeightPanelTasks(height: js.Any): Unit = js.native
    /**
      *
      */
    def init(): js.Function = js.native
    /**
      *
      * @param id
      * @param name
      * @param startDate
      */
    def insertProject(id: js.Any, name: js.Any, startDate: js.Any): js.Any = js.native
    /**
      *
      * @param filename
      */
    def loadJSONData(filename: js.Any): Unit = js.native
    /**
      *
      * @param content
      */
    def loadJSONString(content: js.Any): Unit = js.native
    /**
      *
      * @param parentTask
      */
    def openNode(parentTask: js.Any): Unit = js.native
    /**
      *
      * @param parentTask
      */
    def openTree(parentTask: js.Any): Unit = js.native
    /**
      *
      */
    def postBindEvents(): Unit = js.native
    /**
      *
      */
    def postLoadData(): Unit = js.native
    /**
      *
      * @param count
      * @param current
      * @param multi
      */
    def refresh(count: js.Any, current: js.Any, multi: js.Any): Unit = js.native
    /**
      *
      */
    def refreshController(): Unit = js.native
    /**
      *
      * @param pixelsPerDay
      */
    def refreshParams(pixelsPerDay: js.Any): Unit = js.native
    /**
      *
      * @param row
      */
    def removeCell(row: js.Any): Unit = js.native
    /**
      *
      * @param fileName
      */
    def saveJSONData(fileName: js.Any): Unit = js.native
    /**
      *
      * @param project
      */
    def setPreviousTask(project: js.Any): js.Any = js.native
    /**
      *
      * @param parentTask
      */
    def setPreviousTaskInTree(parentTask: js.Any): js.Any = js.native
    /**
      *
      * @param parentTask
      */
    def setStartTimeChild(parentTask: js.Any): Unit = js.native
    /**
      *
      * @param parenttask
      */
    def sortChildTasks(parenttask: js.Any): js.Any = js.native
    /**
      *
      * @param a
      * @param b
      */
    def sortProjStartDate(a: js.Any, b: js.Any): Double = js.native
    /**
      *
      * @param a
      * @param b
      */
    def sortTaskStartTime(a: js.Any, b: js.Any): Double = js.native
    /**
      *
      * @param project
      */
    def sortTasksByStartTime(project: js.Any): Unit = js.native
    /**
      *
      * @param dip
      */
    def switchTeleMicroView(dip: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/gantt/GanttProjectControl.html
    *
    *
    * @param ganttChart
    * @param projectItem
    */
  @js.native
  class GanttProjectControl protected () extends js.Object {
    def this(ganttChart: js.Any, projectItem: js.Any) = this()
    /**
      *
      */
    def adjustPanelTime(): Unit = js.native
    /**
      *
      */
    def checkWidthProjectNameItem(): Unit = js.native
    /**
      *
      */
    def create(): Unit = js.native
    /**
      *
      */
    def createDescrProject(): js.Any = js.native
    /**
      *
      */
    def createProjectItem(): js.Any = js.native
    /**
      *
      */
    def createProjectNameItem(): js.Any = js.native
    /**
      *
      * @param task
      */
    def deleteChildTask(task: js.Any): Unit = js.native
    /**
      *
      * @param id
      */
    def deleteTask(id: js.Any): Unit = js.native
    /**
      *
      */
    def getDescStr(): String = js.native
    /**
      *
      */
    def getDuration(): Double = js.native
    /**
      *
      */
    def getPercentCompleted(): js.Any = js.native
    /**
      *
      * @param id
      */
    def getTaskById(id: js.Any): js.Any = js.native
    /**
      *
      */
    def hideDescrProject(): Unit = js.native
    /**
      *
      * @param id
      * @param name
      * @param startTime
      * @param duration
      * @param percentage
      * @param previousTaskId
      * @param taskOwner
      * @param parentTaskId
      */
    def insertTask(
      id: js.Any,
      name: js.Any,
      startTime: js.Any,
      duration: js.Any,
      percentage: js.Any,
      previousTaskId: js.Any,
      taskOwner: js.Any,
      parentTaskId: js.Any
    ): js.Any = js.native
    /**
      *
      */
    def postLoadData(): Unit = js.native
    /**
      *
      */
    def refresh(): js.Function = js.native
    /**
      *
      * @param divDesc
      */
    def refreshDescrProject(divDesc: js.Any): js.Any = js.native
    /**
      *
      * @param projectItem
      */
    def refreshProjectItem(projectItem: js.Any): js.Any = js.native
    /**
      *
      * @param width
      */
    def resizeProjectItem(width: js.Any): Unit = js.native
    /**
      *
      * @param task
      * @param id
      */
    def searchTaskInTree(task: js.Any, id: js.Any): js.Any = js.native
    /**
      *
      * @param name
      */
    def setName(name: js.Any): Unit = js.native
    /**
      *
      * @param percentage
      */
    def setPercentCompleted(percentage: js.Any): Boolean = js.native
    /**
      *
      * @param task
      * @param height
      */
    def shiftChildTasks(task: js.Any, height: js.Any): Unit = js.native
    /**
      *
      */
    def shiftDescrProject(): Unit = js.native
    /**
      *
      * @param task
      * @param height
      */
    def shiftNextParentTask(task: js.Any, height: js.Any): Unit = js.native
    /**
      *
      * @param project
      * @param height
      */
    def shiftNextProject(project: js.Any, height: js.Any): Unit = js.native
    /**
      *
      * @param height
      */
    def shiftProject(height: js.Any): Unit = js.native
    /**
      *
      */
    def shiftProjectItem(): Unit = js.native
    /**
      *
      * @param task
      * @param height
      */
    def shiftTask(task: js.Any, height: js.Any): Unit = js.native
    /**
      *
      */
    def showDescrProject(): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/gantt/GanttProjectItem.html
    *
    *
    * @param configuration
    */
  @js.native
  class GanttProjectItem protected () extends GanttTaskItem {
    def this(configuration: js.Any) = this()
    /**
      *
      * @param task
      */
    def addTask(task: js.Any): Unit = js.native
    /**
      *
      * @param id
      */
    def deleteTask(id: js.Any): Unit = js.native
    /**
      *
      * @param id
      */
    def getTaskById(id: js.Any): js.Any = js.native
    /**
      *
      * @param parentTask
      * @param id
      */
    def getTaskByIdInTree(parentTask: js.Any, id: js.Any): js.Any = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/gantt/GanttResourceItem.html
    *
    *
    * @param ganttchart
    */
  @js.native
  class GanttResourceItem protected () extends js.Object {
    def this(ganttchart: js.Any) = this()
    /**
      *
      */
    def buildOwnerTimeConsume(): js.Object = js.native
    /**
      *
      */
    def buildResource(): js.Object = js.native
    /**
      *
      * @param taskNameItem
      */
    def checkWidthTaskNameItem(taskNameItem: js.Any): Unit = js.native
    /**
      *
      */
    def clearAll(): Unit = js.native
    /**
      *
      */
    def clearData(): Unit = js.native
    /**
      *
      */
    def clearItems(): Unit = js.native
    /**
      *
      */
    def create(): Unit = js.native
    /**
      *
      * @param parentNode
      * @param currentNode
      */
    def createConnectingLinesPN(parentNode: js.Any, currentNode: js.Any): js.Array[_] = js.native
    /**
      *
      * @param owner
      * @param parentNode
      * @param task
      */
    def createDetailedTaskEntry(owner: js.Any, parentNode: js.Any, task: js.Any): js.Array[_] = js.native
    /**
      *
      * @param owner
      */
    def createOwnerEntry(owner: js.Any): js.Function = js.native
    /**
      *
      * @param owner
      * @param posY
      */
    def createOwnerItem(owner: js.Any, posY: js.Any): js.Any = js.native
    /**
      *
      * @param owner
      * @param posY
      */
    def createOwnerNameItem(owner: js.Any, posY: js.Any): js.Any = js.native
    /**
      *
      */
    def createPanelNamesOwners(): js.Any = js.native
    /**
      *
      */
    def createPanelOwners(): js.Any = js.native
    /**
      *
      * @param task
      * @param posY
      */
    def createTaskItem(task: js.Any, posY: js.Any): js.Any = js.native
    /**
      *
      * @param owner
      * @param posY
      */
    def createTaskNameItem(owner: js.Any, posY: js.Any): js.Any = js.native
    /**
      *
      * @param ownerNameItem
      */
    def createTreeImg(ownerNameItem: js.Any): js.Any = js.native
    /**
      *
      */
    def postAdjustment(): Unit = js.native
    /**
      *
      */
    def reConstruct(): Unit = js.native
    /**
      *
      */
    def refresh(): Unit = js.native
    /**
      *
      * @param owner
      * @param item
      * @param task
      */
    def refreshDetailedTaskEntry(owner: js.Any, item: js.Any, task: js.Any): Unit = js.native
    /**
      *
      * @param owner
      */
    def refreshOwnerEntry(owner: js.Any): Unit = js.native
    /**
      *
      * @param owner
      */
    def refreshOwnerItem(owner: js.Any): Unit = js.native
    /**
      *
      * @param item
      * @param task
      */
    def refreshTaskItem(item: js.Any, task: js.Any): Unit = js.native
    /**
      *
      * @param tItem
      * @param owner
      * @param displayType
      * @param topOffset
      */
    def styleOwnerItem(tItem: js.Any, owner: js.Any, displayType: js.Any, topOffset: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/gantt/GanttTaskControl.html
    *
    *
    * @param taskInfo
    * @param project
    * @param chart
    */
  @js.native
  class GanttTaskControl protected () extends js.Object {
    def this(taskInfo: js.Any, project: js.Any, chart: js.Any) = this()
    /**
      *
      */
    def adjustPanelTime(): Unit = js.native
    /**
      *
      * @param resourceInfo
      */
    def buildResourceInfo(resourceInfo: js.Any): Unit = js.native
    /**
      *
      * @param startTime
      */
    def checkPos(startTime: js.Any): js.Any = js.native
    /**
      *
      */
    def checkPosition(): Unit = js.native
    /**
      *
      */
    def checkWidthTaskNameItem(): Unit = js.native
    /**
      *
      */
    def clearPredTask(): Unit = js.native
    /**
      *
      */
    def create(): js.Function = js.native
    /**
      *
      */
    def createConnectingLinesDS(): js.Array[_] = js.native
    /**
      *
      */
    def createConnectingLinesPN(): js.Array[_] = js.native
    /**
      *
      */
    def createTaskDescItem(): js.Any = js.native
    /**
      *
      */
    def createTaskItem(): js.Any = js.native
    /**
      *
      */
    def createTaskNameItem(): js.Any = js.native
    /**
      *
      */
    def createTreeImg(): js.Any = js.native
    /**
      *
      */
    def endMove(): Unit = js.native
    /**
      *
      */
    def endResizeItem(): Unit = js.native
    /**
      *
      * @param position               OptionalThe tooltip position.
      */
    def getDateOnPosition(position: js.Array[String]): js.Any = js.native
    /**
      *
      */
    def getMaxPosPredChildTaskItem(): js.Any = js.native
    /**
      *
      * @param task
      */
    def getMaxPosPredChildTaskItemInTree(task: js.Any): Double = js.native
    /**
      *
      */
    def getMoveInfo(): Unit = js.native
    /**
      *
      */
    def getResizeInfo(): Unit = js.native
    /**
      *
      */
    def getTaskOwner(): js.Object = js.native
    /**
      *
      * @param task
      */
    def hideChildTasks(task: js.Any): Unit = js.native
    /**
      *
      */
    def hideDescTask(): Unit = js.native
    /**
      *
      * @param task
      * @param width
      * @param moveChild
      */
    def moveChildTaskItems(task: js.Any, width: js.Any, moveChild: js.Any): Unit = js.native
    /**
      *
      * @param width
      * @param moveChild
      */
    def moveCurrentTaskItem(width: js.Any, moveChild: js.Any): Unit = js.native
    /**
      *
      */
    def moveDescTask(): Unit = js.native
    /**
      *
      * @param event
      */
    def moveItem(event: js.Any): Unit = js.native
    /**
      *
      * @param posX
      */
    def moveTaskItem(posX: js.Any): Unit = js.native
    /**
      *
      * @param obj
      * @param delm
      */
    def objKeyToStr(obj: js.Any, delm: js.Any): String = js.native
    /**
      *
      */
    def postLoadData(): Unit = js.native
    /**
      *
      */
    def refresh(): js.Function = js.native
    /**
      *
      * @param arrLines
      */
    def refreshConnectingLinesDS(arrLines: js.Any): js.Any = js.native
    /**
      *
      * @param divDesc
      */
    def refreshTaskDesc(divDesc: js.Any): js.Any = js.native
    /**
      *
      * @param itemControl
      */
    def refreshTaskItem(itemControl: js.Any): js.Any = js.native
    /**
      *
      * @param event
      */
    def resizeItem(event: js.Any): Unit = js.native
    /**
      *
      * @param width
      */
    def resizeTaskItem(width: js.Any): Unit = js.native
    /**
      *
      * @param duration
      */
    def setDuration(duration: js.Any): Boolean = js.native
    /**
      *
      * @param name
      */
    def setName(name: js.Any): Unit = js.native
    /**
      *
      * @param percentage
      */
    def setPercentCompleted(percentage: js.Any): Boolean = js.native
    /**
      *
      * @param previousTaskId
      */
    def setPreviousTask(previousTaskId: js.Any): Boolean = js.native
    /**
      *
      * @param startTime
      * @param shiftChild
      */
    def setStartTime(startTime: js.Any, shiftChild: js.Any): Boolean = js.native
    /**
      *
      * @param owner
      */
    def setTaskOwner(owner: js.Any): Boolean = js.native
    /**
      *
      * @param task
      * @param height
      */
    def shiftChildTask(task: js.Any, height: js.Any): Unit = js.native
    /**
      *
      * @param task
      * @param height
      */
    def shiftCurrentTasks(task: js.Any, height: js.Any): Unit = js.native
    /**
      *
      * @param task
      * @param height
      */
    def shiftNextTask(task: js.Any, height: js.Any): Unit = js.native
    /**
      *
      * @param task
      * @param height
      */
    def shiftTask(task: js.Any, height: js.Any): Unit = js.native
    /**
      *
      * @param task
      * @param isOpen
      */
    def showChildTasks(task: js.Any, isOpen: js.Any): Unit = js.native
    /**
      *
      */
    def showDescTask(): Unit = js.native
    /**
      *
      * @param event
      */
    def startMove(event: js.Any): Unit = js.native
    /**
      *
      * @param event
      */
    def startResize(event: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/gantt/GanttTaskItem.html
    *
    *
    * @param configuration
    */
  @js.native
  class GanttTaskItem protected () extends js.Object {
    def this(configuration: js.Any) = this()
    /**
      *
      * @param task
      */
    def addChildTask(task: js.Any): Unit = js.native
    /**
      *
      * @param project
      */
    def setProject(project: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/gantt/TabMenu.html
    *
    *
    * @param chart
    */
  @js.native
  class TabMenu protected () extends js.Object {
    def this(chart: js.Any) = this()
    /**
      *
      * @param tab
      */
    def addItemMenuPanel(tab: js.Any): Unit = js.native
    /**
      *
      */
    def buildContent(): Unit = js.native
    /**
      *
      */
    def clear(): Unit = js.native
    /**
      *
      */
    def createMenuPanel(): Unit = js.native
    /**
      *
      * @param id
      * @param desc
      * @param type
      * @param showOInfo
      * @param menu
      * @param withDefaultValue
      */
    def createTab(
      id: js.Any,
      desc: js.Any,
      `type`: js.Any,
      showOInfo: js.Any,
      menu: js.Any,
      withDefaultValue: js.Any
    ): js.Any = js.native
    /**
      *
      */
    def createTabPanel(): Unit = js.native
    /**
      *
      */
    def hide(): Unit = js.native
    /**
      *
      * @param elem
      * @param object
      */
    def show(elem: js.Any, `object`: js.Any): Unit = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/gantt/contextMenuTab.html
    *
    *
    * @param id
    * @param description
    * @param type
    * @param showOInfo
    * @param tabMenu
    * @param withDefaultValue
    */
  @js.native
  class contextMenuTab protected () extends js.Object {
    def this(
      id: js.Any,
      description: js.Any,
      `type`: js.Any,
      showOInfo: js.Any,
      tabMenu: js.Any,
      withDefaultValue: js.Any
    ) = this()
    /**
      *
      * @param handler
      */
    def addAction(handler: js.Any): Unit = js.native
    /**
      *
      */
    def addChildTaskAction(): Unit = js.native
    /**
      *
      * @param id
      * @param name
      * @param key
      * @param required
      */
    def addItem(id: js.Any, name: js.Any, key: js.Any, required: js.Any): Unit = js.native
    /**
      *
      */
    def addProjectAction(): Unit = js.native
    /**
      *
      */
    def addSuccessorTaskAction(): Unit = js.native
    /**
      *
      */
    def addTaskAction(): Unit = js.native
    /**
      *
      */
    def cpProjectAction(): Unit = js.native
    /**
      *
      */
    def cpUpdateAction(): Unit = js.native
    /**
      *
      * @param dateStr
      */
    def decodeDate(dateStr: js.Any): js.Any = js.native
    /**
      *
      */
    def deleteAction(): Unit = js.native
    /**
      *
      */
    def deleteProjectAction(): Unit = js.native
    /**
      *
      */
    def durationUpdateAction(): Unit = js.native
    /**
      *
      * @param date
      */
    def encodeDate(date: js.Any): String = js.native
    /**
      *
      */
    def hide(): Unit = js.native
    /**
      *
      * @param content
      * @param name
      * @param value
      */
    def insertData(content: js.Any, name: js.Any, value: js.Any): Unit = js.native
    /**
      *
      */
    def ownerUpdateAction(): Unit = js.native
    /**
      *
      * @param items
      */
    def preValueValidation(items: js.Any): Boolean = js.native
    /**
      *
      */
    def ptUpdateAction(): Unit = js.native
    /**
      *
      */
    def renameProjectAction(): Unit = js.native
    /**
      *
      */
    def renameTaskAction(): Unit = js.native
    /**
      *
      */
    def show(): Unit = js.native
  }
  
}

