package typings.googleAppsScript.GoogleAppsScript

import typings.googleAppsScript.GoogleAppsScript.Tasks.Collection.TasklistsCollection
import typings.googleAppsScript.GoogleAppsScript.Tasks.Collection.TasksCollection
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Task
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskLinks
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskList
import typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.TaskLists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tasks extends StObject {
  
  var Tasklists: js.UndefOr[TasklistsCollection] = js.native
  
  var Tasks: js.UndefOr[TasksCollection] = js.native
  
  // Create a new instance of Task
  def newTask(): Task = js.native
  
  // Create a new instance of TaskLinks
  def newTaskLinks(): TaskLinks = js.native
  
  // Create a new instance of TaskList
  def newTaskList(): TaskList = js.native
}
object Tasks {
  
  @scala.inline
  def apply(newTask: () => Task, newTaskLinks: () => TaskLinks, newTaskList: () => TaskList): Tasks = {
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
    
    @js.native
    trait Task extends StObject {
      
      var completed: js.UndefOr[String] = js.native
      
      var deleted: js.UndefOr[Boolean] = js.native
      
      var due: js.UndefOr[String] = js.native
      
      var etag: js.UndefOr[String] = js.native
      
      var hidden: js.UndefOr[Boolean] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var links: js.UndefOr[js.Array[TaskLinks]] = js.native
      
      var notes: js.UndefOr[String] = js.native
      
      var parent: js.UndefOr[String] = js.native
      
      var position: js.UndefOr[String] = js.native
      
      var selfLink: js.UndefOr[String] = js.native
      
      var status: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var updated: js.UndefOr[String] = js.native
    }
    object Task {
      
      @scala.inline
      def apply(): Task = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Task]
      }
      
      @scala.inline
      implicit class TaskMutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCompleted(value: String): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompletedUndefined: Self = StObject.set(x, "completed", js.undefined)
        
        @scala.inline
        def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
        
        @scala.inline
        def setDue(value: String): Self = StObject.set(x, "due", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDueUndefined: Self = StObject.set(x, "due", js.undefined)
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setLinks(value: js.Array[TaskLinks]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
        
        @scala.inline
        def setLinksVarargs(value: TaskLinks*): Self = StObject.set(x, "links", js.Array(value :_*))
        
        @scala.inline
        def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
        
        @scala.inline
        def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
        
        @scala.inline
        def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        @scala.inline
        def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      }
    }
    
    @js.native
    trait TaskLinks extends StObject {
      
      var description: js.UndefOr[String] = js.native
      
      var link: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[String] = js.native
    }
    object TaskLinks {
      
      @scala.inline
      def apply(): TaskLinks = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TaskLinks]
      }
      
      @scala.inline
      implicit class TaskLinksMutableBuilder[Self <: TaskLinks] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
        
        @scala.inline
        def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
        
        @scala.inline
        def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait TaskList extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var id: js.UndefOr[String] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var selfLink: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var updated: js.UndefOr[String] = js.native
    }
    object TaskList {
      
      @scala.inline
      def apply(): TaskList = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TaskList]
      }
      
      @scala.inline
      implicit class TaskListMutableBuilder[Self <: TaskList] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setUpdated(value: String): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
      }
    }
    
    @js.native
    trait TaskLists extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var items: js.UndefOr[js.Array[TaskList]] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object TaskLists {
      
      @scala.inline
      def apply(): TaskLists = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[TaskLists]
      }
      
      @scala.inline
      implicit class TaskListsMutableBuilder[Self <: TaskLists] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[TaskList]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: TaskList*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
    
    @js.native
    trait Tasks extends StObject {
      
      var etag: js.UndefOr[String] = js.native
      
      var items: js.UndefOr[js.Array[Task]] = js.native
      
      var kind: js.UndefOr[String] = js.native
      
      var nextPageToken: js.UndefOr[String] = js.native
    }
    object Tasks {
      
      @scala.inline
      def apply(): typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Tasks = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Tasks]
      }
      
      @scala.inline
      implicit class TasksMutableBuilder[Self <: typings.googleAppsScript.GoogleAppsScript.Tasks.Schema.Tasks] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
        
        @scala.inline
        def setItems(value: js.Array[Task]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
        
        @scala.inline
        def setItemsVarargs(value: Task*): Self = StObject.set(x, "items", js.Array(value :_*))
        
        @scala.inline
        def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
        
        @scala.inline
        def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
      }
    }
  }
  
  @scala.inline
  implicit class TasksMutableBuilder[Self <: Tasks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewTask(value: () => Task): Self = StObject.set(x, "newTask", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTaskLinks(value: () => TaskLinks): Self = StObject.set(x, "newTaskLinks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNewTaskList(value: () => TaskList): Self = StObject.set(x, "newTaskList", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTasklists(value: TasklistsCollection): Self = StObject.set(x, "Tasklists", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasklistsUndefined: Self = StObject.set(x, "Tasklists", js.undefined)
    
    @scala.inline
    def setTasks(value: TasksCollection): Self = StObject.set(x, "Tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksUndefined: Self = StObject.set(x, "Tasks", js.undefined)
  }
}
