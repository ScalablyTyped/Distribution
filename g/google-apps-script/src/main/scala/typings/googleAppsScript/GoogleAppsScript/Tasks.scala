package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Tasks.Collection.TasklistsCollection
import typings.googleAppsScript.GoogleAppsScript.Tasks.Collection.TasksCollection
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Task
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskLinks
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskList
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskLists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tasks extends StObject {
  
  var Tasklists: js.UndefOr[TasklistsCollection] = js.undefined
  
  var Tasks: js.UndefOr[TasksCollection] = js.undefined
  
  // Create a new instance of Task
  def newTask(): Task
  
  // Create a new instance of TaskLinks
  def newTaskLinks(): TaskLinks
  
  // Create a new instance of TaskList
  def newTaskList(): TaskList
}
object Tasks {
  
  inline def apply(newTask: () => Task, newTaskLinks: () => TaskLinks, newTaskList: () => TaskList): Tasks = {
    val __obj = js.Dynamic.literal(newTask = js.Any.fromFunction0(newTask), newTaskLinks = js.Any.fromFunction0(newTaskLinks), newTaskList = js.Any.fromFunction0(newTaskList))
    __obj.asInstanceOf[Tasks]
  }
  
  object Collection {
    
    @js.native
    trait TasklistsCollection extends StObject {
      
      // Returns the authenticated user's specified task list.
      def get(tasklist: String): TaskList = js.native
      
      // Creates a new task list and adds it to the authenticated user's task lists.
      def insert(resource: TaskList): TaskList = js.native
      
      // Returns all the authenticated user's task lists.
      def list(): TaskLists = js.native
      // Returns all the authenticated user's task lists.
      def list(optionalArgs: js.Object): TaskLists = js.native
      
      // Updates the authenticated user's specified task list. This method supports patch semantics.
      def patch(resource: TaskList, tasklist: String): TaskList = js.native
      
      // Deletes the authenticated user's specified task list.
      def remove(tasklist: String): Unit = js.native
      
      // Updates the authenticated user's specified task list.
      def update(resource: TaskList, tasklist: String): TaskList = js.native
    }
    
    @js.native
    trait TasksCollection extends StObject {
      
      // Clears all completed tasks from the specified task list. The affected tasks will be marked as 'hidden' and no longer be returned by default when retrieving all tasks for a task list.
      def clear(tasklist: String): Unit = js.native
      
      // Returns the specified task.
      def get(tasklist: String, task: String): Task = js.native
      
      // Creates a new task on the specified task list.
      def insert(resource: Task, tasklist: String): Task = js.native
      // Creates a new task on the specified task list.
      def insert(resource: Task, tasklist: String, optionalArgs: js.Object): Task = js.native
      
      // Returns all tasks in the specified task list.
      def list(tasklist: String): typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Tasks = js.native
      // Returns all tasks in the specified task list.
      def list(tasklist: String, optionalArgs: js.Object): typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Tasks = js.native
      
      // Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a different position among its sibling tasks.
      def move(tasklist: String, task: String): Task = js.native
      // Moves the specified task to another position in the task list. This can include putting it as a child task under a new parent and/or move it to a different position among its sibling tasks.
      def move(tasklist: String, task: String, optionalArgs: js.Object): Task = js.native
      
      // Updates the specified task. This method supports patch semantics.
      def patch(resource: Task, tasklist: String, task: String): Task = js.native
      
      // Deletes the specified task from the task list.
      def remove(tasklist: String, task: String): Unit = js.native
      
      // Updates the specified task.
      def update(resource: Task, tasklist: String, task: String): Task = js.native
    }
  }
  
  object Schema {
    
    trait Task extends StObject {
      
      var completed: js.UndefOr[String] = js.undefined
      
      var deleted: js.UndefOr[Boolean] = js.undefined
      
      var due: js.UndefOr[String] = js.undefined
      
      var etag: js.UndefOr[String] = js.undefined
      
      var hidden: js.UndefOr[Boolean] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var links: js.UndefOr[js.Array[TaskLinks]] = js.undefined
      
      var notes: js.UndefOr[String] = js.undefined
      
      var parent: js.UndefOr[String] = js.undefined
      
      var position: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
      
      var status: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var updated: js.UndefOr[String] = js.undefined
    }
    object Task {
      
      inline def apply(): Task = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Task]
      }
      
      extension [Self <: Task](x: Self) {
        
        inline def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
        
        inline def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
        
        inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        inline def setDue(value: String): Self = StObject.set(x, "due", value.asInstanceOf[js.Any])
        
        inline def setDueUndefined: Self = StObject.set(x, "due", js.undefined)
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setLinks(value: js.Array[TaskLinks]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
        
        inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
        
        inline def setLinksVarargs(value: TaskLinks*): Self = StObject.set(x, "links", js.Array(value*))
        
        inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
        
        inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      }
    }
    
    trait TaskLinks extends StObject {
      
      var description: js.UndefOr[String] = js.undefined
      
      var link: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[String] = js.undefined
    }
    object TaskLinks {
      
      inline def apply(): TaskLinks = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TaskLinks]
      }
      
      extension [Self <: TaskLinks](x: Self) {
        
        inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        inline def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait TaskList extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var id: js.UndefOr[String] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var selfLink: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var updated: js.UndefOr[String] = js.undefined
    }
    object TaskList {
      
      inline def apply(): TaskList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TaskList]
      }
      
      extension [Self <: TaskList](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      }
    }
    
    trait TaskLists extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[TaskList]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object TaskLists {
      
      inline def apply(): TaskLists = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TaskLists]
      }
      
      extension [Self <: TaskLists](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[TaskList]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: TaskList*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    trait Tasks extends StObject {
      
      var etag: js.UndefOr[String] = js.undefined
      
      var items: js.UndefOr[js.Array[Task]] = js.undefined
      
      var kind: js.UndefOr[String] = js.undefined
      
      var nextPageToken: js.UndefOr[String] = js.undefined
    }
    object Tasks {
      
      inline def apply(): typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Tasks = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Tasks]
      }
      
      extension [Self <: typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Tasks](x: Self) {
        
        inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        inline def setItems(value: js.Array[Task]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        inline def setItemsVarargs(value: Task*): Self = StObject.set(x, "items", js.Array(value*))
        
        inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
  }
  
  extension [Self <: Tasks](x: Self) {
    
    inline def setNewTask(value: () => Task): Self = StObject.set(x, "newTask", js.Any.fromFunction0(value))
    
    inline def setNewTaskLinks(value: () => TaskLinks): Self = StObject.set(x, "newTaskLinks", js.Any.fromFunction0(value))
    
    inline def setNewTaskList(value: () => TaskList): Self = StObject.set(x, "newTaskList", js.Any.fromFunction0(value))
    
    inline def setTasklists(value: TasklistsCollection): Self = StObject.set(x, "Tasklists", value.asInstanceOf[js.Any])
    
    inline def setTasklistsUndefined: Self = StObject.set(x, "Tasklists", js.undefined)
    
    inline def setTasks(value: TasksCollection): Self = StObject.set(x, "Tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "Tasks", js.undefined)
  }
}
