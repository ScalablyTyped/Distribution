```
/**
Elegant spinner for interactive CLI apps.

__You probably want [`ora`](https://github.com/sindresorhus/ora) instead, which includes this spinner and handles the animation for you.__

@example
```
import elegantSpinner = require('elegant-spinner');
import logUpdate = require('log-update');

const frame = elegantSpinner();

setInterval(() => {
	logUpdate(frame());
}, 50);
```
*/
```