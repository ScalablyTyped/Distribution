package typings.gitParse

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("git-parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkoutCommit(pathToRepo: String, hash: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkoutCommit")(pathToRepo.asInstanceOf[js.Any], hash.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def checkoutCommit(pathToRepo: String, hash: String, options: CheckoutCommmitOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("checkoutCommit")(pathToRepo.asInstanceOf[js.Any], hash.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def gitDiff(pathToRepo: String, commitHash1: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("gitDiff")(pathToRepo.asInstanceOf[js.Any], commitHash1.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def gitDiff(pathToRepo: String, commitHash1: String, commitHash2: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("gitDiff")(pathToRepo.asInstanceOf[js.Any], commitHash1.asInstanceOf[js.Any], commitHash2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def gitDiff(pathToRepo: String, commitHash1: String, commitHash2: String, file: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("gitDiff")(pathToRepo.asInstanceOf[js.Any], commitHash1.asInstanceOf[js.Any], commitHash2.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def gitDiff(pathToRepo: String, commitHash1: String, commitHash2: Unit, file: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("gitDiff")(pathToRepo.asInstanceOf[js.Any], commitHash1.asInstanceOf[js.Any], commitHash2.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def gitPull(pathToRepo: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("gitPull")(pathToRepo.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def gitToJs(repoPath: String): js.Promise[js.Array[GitCommit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("gitToJs")(repoPath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[GitCommit]]]
  inline def gitToJs(repoPath: String, options: GitToJsOptions): js.Promise[js.Array[GitCommit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("gitToJs")(repoPath.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[GitCommit]]]
  
  trait CheckoutCommmitOptions extends StObject {
    
    var force: js.UndefOr[Boolean] = js.undefined
  }
  object CheckoutCommmitOptions {
    
    inline def apply(): CheckoutCommmitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CheckoutCommmitOptions]
    }
    
    extension [Self <: CheckoutCommmitOptions](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  trait FileModification extends StObject {
    
    var linesAdded: js.UndefOr[Double] = js.undefined
    
    var linesDeleted: js.UndefOr[Double] = js.undefined
    
    var path: String
  }
  object FileModification {
    
    inline def apply(path: String): FileModification = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileModification]
    }
    
    extension [Self <: FileModification](x: Self) {
      
      inline def setLinesAdded(value: Double): Self = StObject.set(x, "linesAdded", value.asInstanceOf[js.Any])
      
      inline def setLinesAddedUndefined: Self = StObject.set(x, "linesAdded", js.undefined)
      
      inline def setLinesDeleted(value: Double): Self = StObject.set(x, "linesDeleted", value.asInstanceOf[js.Any])
      
      inline def setLinesDeletedUndefined: Self = StObject.set(x, "linesDeleted", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileRename extends StObject {
    
    var newPath: String
    
    var oldPath: String
  }
  object FileRename {
    
    inline def apply(newPath: String, oldPath: String): FileRename = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileRename]
    }
    
    extension [Self <: FileRename](x: Self) {
      
      inline def setNewPath(value: String): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      inline def setOldPath(value: String): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait GitCommit extends StObject {
    
    var authorEmail: String
    
    var authorName: String
    
    var date: String
    
    var filesAdded: js.Array[FileModification]
    
    var filesDeleted: js.Array[FileModification]
    
    var filesModified: js.Array[FileModification]
    
    var filesRenamed: js.Array[FileRename]
    
    var hash: String
    
    var message: String
  }
  object GitCommit {
    
    inline def apply(
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
    
    extension [Self <: GitCommit](x: Self) {
      
      inline def setAuthorEmail(value: String): Self = StObject.set(x, "authorEmail", value.asInstanceOf[js.Any])
      
      inline def setAuthorName(value: String): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
      
      inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setFilesAdded(value: js.Array[FileModification]): Self = StObject.set(x, "filesAdded", value.asInstanceOf[js.Any])
      
      inline def setFilesAddedVarargs(value: FileModification*): Self = StObject.set(x, "filesAdded", js.Array(value :_*))
      
      inline def setFilesDeleted(value: js.Array[FileModification]): Self = StObject.set(x, "filesDeleted", value.asInstanceOf[js.Any])
      
      inline def setFilesDeletedVarargs(value: FileModification*): Self = StObject.set(x, "filesDeleted", js.Array(value :_*))
      
      inline def setFilesModified(value: js.Array[FileModification]): Self = StObject.set(x, "filesModified", value.asInstanceOf[js.Any])
      
      inline def setFilesModifiedVarargs(value: FileModification*): Self = StObject.set(x, "filesModified", js.Array(value :_*))
      
      inline def setFilesRenamed(value: js.Array[FileRename]): Self = StObject.set(x, "filesRenamed", value.asInstanceOf[js.Any])
      
      inline def setFilesRenamedVarargs(value: FileRename*): Self = StObject.set(x, "filesRenamed", js.Array(value :_*))
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait GitToJsOptions extends StObject {
    
    var sinceCommit: js.UndefOr[String] = js.undefined
  }
  object GitToJsOptions {
    
    inline def apply(): GitToJsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitToJsOptions]
    }
    
    extension [Self <: GitToJsOptions](x: Self) {
      
      inline def setSinceCommit(value: String): Self = StObject.set(x, "sinceCommit", value.asInstanceOf[js.Any])
      
      inline def setSinceCommitUndefined: Self = StObject.set(x, "sinceCommit", js.undefined)
    }
  }
}
