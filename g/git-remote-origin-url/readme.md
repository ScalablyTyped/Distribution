```
/**
Get the remote origin url of a Git repository.

@param cwd - The current working directory. Default: `process.cwd()`.

@example
```
import gitRemoteOriginUrl = require('git-remote-origin-url');

(async() => {
	console.log(await gitRemoteOriginUrl());
	//=> 'git@github.com:sindresorhus/git-remote-origin-url.git'
})();
```
*/
```