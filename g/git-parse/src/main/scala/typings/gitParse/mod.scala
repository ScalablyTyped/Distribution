package typings.gitParse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-parse", "checkoutCommit")
  @js.native
  def checkoutCommit(pathToRepo: String, hash: String): js.Promise[Unit] = js.native
  @JSImport("git-parse", "checkoutCommit")
  @js.native
  def checkoutCommit(pathToRepo: String, hash: String, options: CheckoutCommmitOptions): js.Promise[Unit] = js.native
  
  @JSImport("git-parse", "gitDiff")
  @js.native
  def gitDiff(pathToRepo: String, commitHash1: String): js.Promise[String] = js.native
  @JSImport("git-parse", "gitDiff")
  @js.native
  def gitDiff(pathToRepo: String, commitHash1: String, commitHash2: js.UndefOr[scala.Nothing], file: String): js.Promise[String] = js.native
  @JSImport("git-parse", "gitDiff")
  @js.native
  def gitDiff(pathToRepo: String, commitHash1: String, commitHash2: String): js.Promise[String] = js.native
  @JSImport("git-parse", "gitDiff")
  @js.native
  def gitDiff(pathToRepo: String, commitHash1: String, commitHash2: String, file: String): js.Promise[String] = js.native
  
  @JSImport("git-parse", "gitPull")
  @js.native
  def gitPull(pathToRepo: String): js.Promise[Unit] = js.native
  
  @JSImport("git-parse", "gitToJs")
  @js.native
  def gitToJs(repoPath: String): js.Promise[js.Array[GitCommit]] = js.native
  @JSImport("git-parse", "gitToJs")
  @js.native
  def gitToJs(repoPath: String, options: GitToJsOptions): js.Promise[js.Array[GitCommit]] = js.native
  
  @js.native
  trait CheckoutCommmitOptions extends StObject {
    
    var force: js.UndefOr[Boolean] = js.native
  }
  object CheckoutCommmitOptions {
    
    @scala.inline
    def apply(): CheckoutCommmitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckoutCommmitOptions]
    }
    
    @scala.inline
    implicit class CheckoutCommmitOptionsMutableBuilder[Self <: CheckoutCommmitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  @js.native
  trait FileModification extends StObject {
    
    var linesAdded: js.UndefOr[Double] = js.native
    
    var linesDeleted: js.UndefOr[Double] = js.native
    
    var path: String = js.native
  }
  object FileModification {
    
    @scala.inline
    def apply(path: String): FileModification = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileModification]
    }
    
    @scala.inline
    implicit class FileModificationMutableBuilder[Self <: FileModification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLinesAdded(value: Double): Self = StObject.set(x, "linesAdded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesAddedUndefined: Self = StObject.set(x, "linesAdded", js.undefined)
      
      @scala.inline
      def setLinesDeleted(value: Double): Self = StObject.set(x, "linesDeleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinesDeletedUndefined: Self = StObject.set(x, "linesDeleted", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FileRename extends StObject {
    
    var newPath: String = js.native
    
    var oldPath: String = js.native
  }
  object FileRename {
    
    @scala.inline
    def apply(newPath: String, oldPath: String): FileRename = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileRename]
    }
    
    @scala.inline
    implicit class FileRenameMutableBuilder[Self <: FileRename] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNewPath(value: String): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOldPath(value: String): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GitCommit extends StObject {
    
    var authorEmail: String = js.native
    
    var authorName: String = js.native
    
    var date: String = js.native
    
    var filesAdded: js.Array[FileModification] = js.native
    
    var filesDeleted: js.Array[FileModification] = js.native
    
    var filesModified: js.Array[FileModification] = js.native
    
    var filesRenamed: js.Array[FileRename] = js.native
    
    var hash: String = js.native
    
    var message: String = js.native
  }
  object GitCommit {
    
    @scala.inline
    def apply(
      authorEmail: String,
      authorName: String,
      date: String,
      filesAdded: js.Array[FileModification],
      filesDeleted: js.Array[FileModification],
      filesModified: js.Array[FileModification],
      filesRenamed: js.Array[FileRename],
      hash: String,
      message: String
    ): GitCommit = {
      val __obj = js.Dynamic.literal(authorEmail = authorEmail.asInstanceOf[js.Any], authorName = authorName.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], filesAdded = filesAdded.asInstanceOf[js.Any], filesDeleted = filesDeleted.asInstanceOf[js.Any], filesModified = filesModified.asInstanceOf[js.Any], filesRenamed = filesRenamed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[GitCommit]
    }
    
    @scala.inline
    implicit class GitCommitMutableBuilder[Self <: GitCommit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorEmail(value: String): Self = StObject.set(x, "authorEmail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesAdded(value: js.Array[FileModification]): Self = StObject.set(x, "filesAdded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesAddedVarargs(value: FileModification*): Self = StObject.set(x, "filesAdded", js.Array(value :_*))
      
      @scala.inline
      def setFilesDeleted(value: js.Array[FileModification]): Self = StObject.set(x, "filesDeleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesDeletedVarargs(value: FileModification*): Self = StObject.set(x, "filesDeleted", js.Array(value :_*))
      
      @scala.inline
      def setFilesModified(value: js.Array[FileModification]): Self = StObject.set(x, "filesModified", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesModifiedVarargs(value: FileModification*): Self = StObject.set(x, "filesModified", js.Array(value :_*))
      
      @scala.inline
      def setFilesRenamed(value: js.Array[FileRename]): Self = StObject.set(x, "filesRenamed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesRenamedVarargs(value: FileRename*): Self = StObject.set(x, "filesRenamed", js.Array(value :_*))
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GitToJsOptions extends StObject {
    
    var sinceCommit: js.UndefOr[String] = js.native
  }
  object GitToJsOptions {
    
    @scala.inline
    def apply(): GitToJsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitToJsOptions]
    }
    
    @scala.inline
    implicit class GitToJsOptionsMutableBuilder[Self <: GitToJsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSinceCommit(value: String): Self = StObject.set(x, "sinceCommit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSinceCommitUndefined: Self = StObject.set(x, "sinceCommit", js.undefined)
    }
  }
}
